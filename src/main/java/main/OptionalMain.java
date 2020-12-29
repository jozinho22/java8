package main;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(value);

        Object value2 = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("Bad type !!!"));
        System.out.println(value2);

        Optional.ofNullable("123@example.com")
                .ifPresent(email -> System.out.println("sending email to " + email));

    }
}
