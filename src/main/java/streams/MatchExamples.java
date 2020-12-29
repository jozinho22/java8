package streams;

import model.GenreEnum;
import model.Personne;

import java.util.List;
import java.util.function.Predicate;

public class MatchExamples {

    public static boolean containsOnlyFemales(List<Personne> personnes) {
        Predicate<Personne> femalePredicate = personne -> GenreEnum.FEMME.equals(personne.getGenre());

        return personnes.stream().allMatch(femalePredicate);
    }

    public static boolean containsAtLeastOneFemale(List<Personne> personnes) {
        Predicate<Personne> femalePredicate = personne -> GenreEnum.FEMME.equals(personne.getGenre());

        return personnes.stream().anyMatch(femalePredicate);
    }
    public static boolean containsNoFemaleAtAll(List<Personne> personnes) {
        Predicate<Personne> femalePredicate = personne -> GenreEnum.FEMME.equals(personne.getGenre());

        return personnes.stream().noneMatch(femalePredicate);
    }

}
