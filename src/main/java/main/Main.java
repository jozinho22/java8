package main;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import model.Personne;
import model.Product;
import streams.*;

public class Main {

	public static void main(String[] args) {

		// filter
		Personne joss = new Personne("Joss", 25, 70, 181);
		Personne mike = new Personne("Mike", 20, 80, 165);
		Personne david = new Personne("David", 32, 75, 187);
		Personne vince = new Personne("Vince", 31, 65, 178);

		List<Personne> personnes = Arrays.asList(joss, mike, david, vince);
		
		FilterExamples.filtrerSelonAge(personnes);
		FilterExamples.filtrerSelonPoids(personnes);
		
		// reduce
		String[] letters = {"a", "b", "c", "d", "e"};
		ReduceExamples.reduceConcatStrings(letters);
		List<String> lettersList = Arrays.asList("a", "b", "c", "d", "e");
		ReduceExamples.reduceConcatStringsList(lettersList);
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ReduceExamples.reduceAddIntegers(numbers);
		ReduceExamples.reduceAddIntegers2(numbers);
		ReduceExamples.reduceGetMax(numbers);

		// map
		List<String> strings = Arrays.asList("Joss", "Jack", "Mike", "Anna", "Samantha");
		List<String> tuUpperCase = MapExamples.mapToUpperCase(strings);
		System.out.println(tuUpperCase);
		
		// map then reduce
		List<Product> products = Arrays.asList(
                new Product("Hifi stereo", BigDecimal.valueOf(69.99), BigDecimal.valueOf(1)),
                new Product("Radio", BigDecimal.valueOf(19.99), BigDecimal.valueOf(2)),
                new Product("Television", BigDecimal.valueOf(399), BigDecimal.valueOf(2))
        );
		
		BigDecimal total = MapThenReduceExamples.getTotalAmout(products);
		System.out.println(total);
		
		// filter than map
		List<BigDecimal> imcList = FilterThenMapExamples.listImcDesPersonneDePlusDe25AnsEtDeMoinsDe70kg(personnes);
		System.out.println(imcList);
		
		Map<String, BigDecimal> imcMap = FilterThenMapExamples.mapImcDesPersonneDePlusDe25AnsEtDeMoinsDe70kg(personnes);
		System.out.println(imcMap);

		// filter then sort
		List<Personne> filterAndSortByAgeAscPersons = SortExamples.sortByAgeAscPersons(personnes);
		System.out.println(filterAndSortByAgeAscPersons);
		List<Personne> filterAndSortByAgeDescPersons = SortExamples.sortByAgeDescPersons(personnes);
		System.out.println(filterAndSortByAgeDescPersons);
		List<Personne> filterAndSortByAgeAscAndPoidsAscPersons = SortExamples.sortByAgeAscAndPoidsAscPersons(personnes);
		filterAndSortByAgeAscAndPoidsAscPersons.forEach(System.out::println);


	}

}
