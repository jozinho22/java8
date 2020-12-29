package combinatorpattern;

import function.PredicateExample;
import model.Personne;

import java.util.function.Function;

public interface PersonneValidation extends Function<Personne, ValidationResult> {

    static PersonneValidation isTailleValid() {
        return personne -> PredicateExample.isAuthorizedRollerCoasterPredicate.test(personne) ?
                ValidationResult.SUCCESS :
                    ValidationResult.TAILLE_TOO_SMALL ;
    }

    static PersonneValidation isMajor() {
        return personne -> PredicateExample.isMajor.test(personne) ?
                ValidationResult.SUCCESS :
                    ValidationResult.NOT_MAJOR ;
    }

    default PersonneValidation and(PersonneValidation other) {
        return personne -> {
            ValidationResult result = this.apply(personne);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(personne) : result;
        };
    }

}
