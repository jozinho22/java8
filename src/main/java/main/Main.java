package main;

import java.util.Arrays;
import java.util.List;

import streams.Personne;
import streams.Streams;

public class Main {

	public static void main(String[] args) {

		Personne joss = new Personne("Joss", 25, 70);
		Personne mike = new Personne("Mike", 20, 80);
		Personne david = new Personne("David", 32, 75);
		Personne vince = new Personne("Vince", 31, 65);

		List<Personne> personnes = Arrays.asList(joss, mike, david, vince);
		
		Streams.filtrerSelonAge(personnes);
		Streams.filtrerSelonPoids(personnes);
		
	}

}
