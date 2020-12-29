package main;

import function.FunctionExample;

public class FunctionMain {

    public static void main(String[] args) {

        int start = 0;
        // declarative way
        int incrementDecl = FunctionExample.incrementByOne(start);
        System.out.println("declarative way");
        System.out.println(incrementDecl);
        // functional way
        int incrementFunc = FunctionExample.incrementByOneFunction.apply(start);
        System.out.println("functional way");
        System.out.println(incrementFunc);

        int multiplyFunc = FunctionExample.multiplyByTenFunction.apply(incrementFunc);
        System.out.println(multiplyFunc);

        int incrementAndMultiplyFunc = FunctionExample.incrementByOneAndMultiplyByTenFunc.apply(start);
        System.out.println(incrementAndMultiplyFunc);

        int multiplyAndIncrementFunc = FunctionExample.multiplyByTenAndIncrementByOneFunc.apply(start);
        System.out.println("using compose instead of andThen");
        System.out.println(multiplyAndIncrementFunc);

        int incrementAndMultiplyBiDecl = FunctionExample.incrementByOneAndMulitplyByTen(1 , 10);
        System.out.println("bifunctional way");
        System.out.println(incrementAndMultiplyBiDecl);

        int incrementAndMultiplyBiFunc = FunctionExample.incrementByOneAndMultiplyByTenBiFunction.apply(1 , 10);
        System.out.println(incrementAndMultiplyBiFunc);
    }
}
