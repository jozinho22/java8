package function;

import model.Personne;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void greetPersonne(Personne personne) {
        System.out.println("Hello " + personne.getName());
    }

    public static Consumer<Personne> greetPersonneConsumer =
        personne -> System.out.println("Hello " + personne.getName());

    public static BiConsumer<Personne, Boolean> greetPersonneConsumerWithPoids =
            (personne, showPoids) -> System.out.println("Hello " + personne.getName()
            + " - poids : " + (showPoids ?  personne.getPoids() : "***"));
}
