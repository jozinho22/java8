package main;

import function.ConsumerExample;
import model.GenreEnum;
import model.Personne;

public class ConsumerMain {

    public static void main(String[] args) {

        // Java normal method
        Personne p = new Personne("Jozinho", 33, 65, 181, GenreEnum.HOMME) ;

        // Consumer Functional interface
        ConsumerExample.greetPersonne(p);
        ConsumerExample.greetPersonneConsumer.accept(p);
        ConsumerExample.greetPersonneConsumerWithPoids.accept(p, true);
        ConsumerExample.greetPersonneConsumerWithPoids.accept(p, false);

    }
}
