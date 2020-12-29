package function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    // Function : takes one argument and produces one result
    // <[input], [ouput]>
    public static int incrementByOne(int number) {
        return number + 1;
    }

    public static Function<Integer, Integer>  incrementByOneFunction = number -> number + 1;

    public static Function<Integer, Integer>  multiplyByTenFunction = number -> number * 10;

    public static Function<Integer, Integer>  incrementByOneAndMultiplyByTenFunc =
            incrementByOneFunction.andThen(multiplyByTenFunction);

    // compose execute in the inverse order than andThen()
    public static Function<Integer, Integer>  multiplyByTenAndIncrementByOneFunc =
            incrementByOneFunction.compose(multiplyByTenFunction);


    // BiFunction : takes two argument and produces one result
    // two inputs, one output
    public static int incrementByOneAndMulitplyByTen(int number, int numberToMutiply) {
        return (number + 1) * numberToMutiply;
    }

    public static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByTenBiFunction =
            (numberToIncrementBy, numberToMultiplyBy) -> (numberToIncrementBy + 1) * numberToMultiplyBy;
}
