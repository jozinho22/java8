package main;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import combinatorpattern.PersonneValidation;
import combinatorpattern.ValidationResult;
import model.GenreEnum;
import model.Personne;

public class CombinatorPatternMain {

    public static void main(String[] args) {

        Personne john = new Personne("John", 21, 80, 175, GenreEnum.HOMME) ;
        Personne alice = new Personne("Alice", 25, 55, 145, GenreEnum.FEMME) ;

        // using combinator pattern
        ValidationResult result = PersonneValidation.isTailleValid()
                .and(PersonneValidation.isMajor())
                .apply(john);

        ValidationResult result2 = PersonneValidation.isTailleValid()
                .and(PersonneValidation.isMajor())
                .apply(alice);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
        if(result2 != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result2.name());
        }

    }

}
