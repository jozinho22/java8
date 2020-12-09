package streams;

import model.GenreEnum;
import model.Personne;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupExamples {

    public static Map<GenreEnum, List<Personne>> getPersonnesGroupByGenre(List<Personne> personnes) {

        return personnes
                .stream()
                .collect(Collectors.groupingBy(Personne::getGenre));
    }
}
