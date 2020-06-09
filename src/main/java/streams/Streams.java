package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static List<Personne> filtrerSelonAge(List<Personne> personnes) {

		List<Personne> listFiltree = personnes
				.stream()
				.filter(p -> p.getAge() > 30)
				.collect(Collectors.toList());

		return listFiltree;

	}

	public static List<Personne> filtrerSelonPoids(List<Personne> personnes) {

		System.out.println(personnes);
		List<Personne> listFiltree = personnes
				.stream()
				.filter(Personne::isOver70kg)
				.collect(Collectors.toList());
		System.out.println(listFiltree);

		return listFiltree;

	}
}
