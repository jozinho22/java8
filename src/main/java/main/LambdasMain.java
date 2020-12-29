package main;

import java.util.Locale;
import java.util.function.Function;

public class LambdasMain {

    public static void main(String[] args) {

        // these two invocations are equals
        Function<String, String> upperCaseName = name -> name.toUpperCase();
        Function<String, String> upperCaseName2 = String::toUpperCase;

        Function<String, String> upperCaseName3 = name -> {
            if (name.isEmpty()) {
                throw new IllegalStateException("The name cannot be blank");
            }
            return name.toUpperCase();
        };

    }
}
