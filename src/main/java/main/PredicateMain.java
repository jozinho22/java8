package main;

import function.PredicateExample;
import model.GenreEnum;
import model.Personne;

public class PredicateMain {

    public static void main(String[] args) {

        Personne john = new Personne("John", 21, 80, 175, GenreEnum.HOMME) ;
        Personne alice = new Personne("Alice", 25, 55, 145, GenreEnum.FEMME) ;

        // declarative way
        System.out.println("declarative way");
        System.out.println(PredicateExample.isAuthorizedRollerCoaster(john.getTaille()));
        System.out.println(PredicateExample.isAuthorizedRollerCoaster(alice.getTaille()));

        // functional way with Predicate interface
        System.out.println("functional way");
        System.out.println(PredicateExample.isAuthorizedRollerCoasterPredicate.test(john));
        System.out.println(PredicateExample.isAuthorizedRollerCoasterPredicate.test(alice));

        System.out.println(PredicateExample.isAuthorizedRollerCoasterPredicate
                .and(PredicateExample.isMajor).test(john));
        System.out.println(PredicateExample.isAuthorizedRollerCoasterPredicate
                .and(PredicateExample.isMajor).test(alice));

        // BiPredicate
        System.out.println("BiPredicate");
        System.out.println(PredicateExample.isBothAuthorizedRollerCoasterPredicateAnd.test(john, alice));
    }
}
