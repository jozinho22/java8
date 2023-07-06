package main.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sudoku {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();

        for(int k = 0; k < 9; k++) {
            List<Integer> line = new ArrayList<>();
            for(int l = 0; l < 9; l++) {
                line.add(l);
            }
            Collections.shuffle(line);
            list.add(line);
        }
        list.forEach(l -> System.out.println(l));

        // verifier les lignes
        /*for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).size() - 1; j++) {
                for(int k = j + 1; k < list.get(i).size(); k++) {
                    System.out.println("-----------");
                    System.out.println(list.get(i).get(j));
                    System.out.println(list.get(i).get(k));
                    System.out.println("-----------");
                    if(list.get(i).get(j) == list.get(i).get(k)) {
                        throw new RuntimeException("Ligne " + i + " incorrecte");
                    }

                }
            }
            System.out.println("-----------");
            System.out.println("Nouvelle ligne");
            System.out.println("-----------");
        }*/

        // verifier les colonnes
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - 1; j++) {
                for(int k = i + 1; k < list.size(); k++) {
                    System.out.println("-----------");
                    System.out.println(list.get(i).get(j));
                    System.out.println(list.get(k).get(j));
                    System.out.println("-----------");
                    if(list.get(i).get(j) == list.get(k).get(j)) {
                        throw new RuntimeException("Colonne " + j + " incorrecte");
                    }

                }
                System.out.println("-----------");
                System.out.println("Nouvelle colonne");
                System.out.println("-----------");
            }

        }

    }
}
