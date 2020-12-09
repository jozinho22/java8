package streams;

import model.Personne;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MinMaxExamples {
    
    public static Personne getOlder(List<Personne> personnes) {

        return personnes
                .stream()
                .max(Comparator.comparing(Personne::getAge))
                .orElseThrow(NoSuchElementException::new);
    }
}
