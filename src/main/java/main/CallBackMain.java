package main;

import java.util.function.Consumer;

public class CallBackMain {

    public static void main(String[] args) {

        hello("John", "Doe", value -> {
            System.out.println("lastname not provided for " + value);
        });

        hello("John", null, value -> {
            System.out.println("lastname not provided for " + value);
        });
    }

    static void hello(String firstname, String lastname, Consumer<String> callBack) {
        System.out.println(firstname);
        if(lastname != null) {
            System.out.println(lastname);
        } else {
            callBack.accept(firstname);
        }
    }

    // js way

//    function hello(firstname, lastname, callback ) {
//        console.log(fisrtname);
//        if(lastname) {
//            console.log(lastname);
//        } else {
//            callback();
//        }
//    }
}
