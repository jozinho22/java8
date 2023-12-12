package main.test;

import java.util.ArrayList;
import java.util.List;

public class ExclamationPoints {

    public static void main(String[] args) {

        String sentence = "Hello ! How do you do ? I'm fine. Thank you !!!";

        // begin
        List<Integer> indexToApply = new ArrayList<>();
        outerloop:
        for(int k = 0; k < sentence.length(); k++) {
            System.out.println("k - sentence.charAt(" + k +") :" + sentence.charAt(k));
            if(sentence.charAt(k) == '!') {
                for(int l = k + 1; l < sentence.length(); l++) {
                    System.out.println("l - sentence.charAt(" + l + ") :" + sentence.charAt(l));
                    if(sentence.charAt(l) == '!') {
                        if(l == sentence.length() - 1) {
                            indexToApply.add(l);
                            break outerloop;
                        } else {
                            continue;
                        }

                    } else {
                        indexToApply.add(l);
                        break;
                    }
                }
            }
        }

        String result = sentence;
        for(Integer i : indexToApply) {
            String begin = result.substring(0, i);
            String end = result.substring(i);
            begin += "!";
            result = begin + end;
        }

        String finalResult = result.replace(".", "!");
        System.out.println(sentence);
        System.out.println(finalResult);
    }

}
