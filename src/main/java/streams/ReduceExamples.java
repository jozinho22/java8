package streams;

import java.util.Arrays;
import java.util.List;

import model.Personne;

public class ReduceExamples {

	public static String reduceConcatStrings(String[] strings) {

		String result = Arrays.stream(strings)
		                .reduce("", (a,b) -> a + b);
		
		return result;

	}
	
	public static String reduceConcatStringsList(List<String> strings) {

		String result = strings.stream()
		                .reduce("", (a,b) -> a + b);
		
		return result;

	}
	
	public static int reduceAddIntegers(int[] integers) {

		int sum = Arrays
				.stream(integers)
				.reduce(0, (a, b) -> a + b); 
		
		return sum;

	}
	
	
	public static int reduceAddIntegers2(int[] integers) {

		int sum = Arrays
				.stream(integers)
				.reduce(0, Integer::sum);

		return sum;

	}
	
	public static int reduceGetMax(int[] integers) {

		int max = Arrays
				.stream(integers)
				.reduce(0, (a, b) -> a > b ? a : b);

		return max;

	}
	
	public static int reduceGetMin(int[] integers) {

		int min = Arrays.
				stream(integers)
				.reduce(0, (a, b) -> a < b ? a : b);

		return min;

	}
	
	
}
