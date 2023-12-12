package main.test;

import java.util.ArrayList;
import java.util.List;

public class Recipes {

    public static void main(String[] args) {

        List<String> ingredients = new ArrayList<>();
        ingredients.add("4 oeufs");
        ingredients.add("250 g de farine");
        ingredients.add("250 g de beurre");
        ingredients.add("100 g de chocolat");

        int nbPersonnes = 5;

        for(int k = 0; k < ingredients.size(); k++) {
            String numbStr = ingredients.get(k).substring(0, ingredients.get(k).indexOf(" "));
            int numb = Integer.parseInt(numbStr);
            int newNumb = nbPersonnes*numb;
            ingredients.set(k, ingredients.get(k).replace(numbStr, String.valueOf(newNumb)));
        }

        ingredients.forEach(System.out::println);


    }

}
