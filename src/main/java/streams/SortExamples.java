package streams;

import model.Personne;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExamples {

    public static List<Personne> sortByAgeAscPersons(List<Personne> personnes) {
        List<Personne> sorted = personnes
                .stream()
                .sorted(Comparator.comparing(Personne::getAge))
                .collect(Collectors.toList());

        return sorted;
    }


    public static List<Personne> sortByAgeDescPersons(List<Personne> personnes) {
        List<Personne> sorted = personnes
                .stream()
                .sorted(Comparator.comparing(Personne::getAge).reversed())
                .collect(Collectors.toList());

        return sorted;
    }

    public static List<Personne> sortByAgeAscAndPoidsAscPersons(List<Personne> personnes) {
        List<Personne> sorted = personnes
                .stream()
                .sorted(Comparator.comparing(Personne::getAge).thenComparing(Personne::getPoids))
                .collect(Collectors.toList());

        return sorted;
    }

}
