package function;

import model.Personne;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    // Java normal method
    public static boolean isAuthorizedRollerCoaster(int taille) {
        return taille > 150;
    }

    // Functional Predicate interface
    public static Predicate<Personne> isAuthorizedRollerCoasterPredicate =
        p -> p.getTaille() > 150;

    public static Predicate<Personne> isMajor =
            p -> p.getAge() >= 18;

    public static BiPredicate<Personne, Personne> isBothAuthorizedRollerCoasterPredicateAnd =
            (p1, p2) -> isAuthorizedRollerCoasterPredicate.test(p1)
                    && isAuthorizedRollerCoasterPredicate.test(p2);
}
