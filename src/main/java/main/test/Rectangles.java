package main.test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Rectangles {

    public static void main(String[] args) {

        List<List<Integer>> coordinates = new ArrayList<>();
        List<Integer> coor1 = new ArrayList<>();
        coor1.add(10); coor1.add(16);
        List<Integer> coor2 = new ArrayList<>();
        coor2.add(30); coor2.add(16);
        List<Integer> coor3 = new ArrayList<>();
        coor3.add(30); coor3.add(42);
        List<Integer> coor4 = new ArrayList<>();
        coor4.add(10); coor4.add(42);

        coordinates.add(coor1);
        coordinates.add(coor2);
        coordinates.add(coor3);
        coordinates.add(coor4);

        // begin
        Integer minX = coordinates.stream()
                .map(c -> c.get(0))
                .mapToInt(c -> c)
                .min().orElseThrow(NoSuchElementException::new);

        Integer minY = coordinates.stream()
                .map(c -> c.get(1))
                .mapToInt(c -> c)
                .min().orElseThrow(NoSuchElementException::new);

        System.out.println(minX + " " + " " +  minY);

    }

}
