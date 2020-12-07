package streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Personne;

public class FilterThenMapExamples {
	
	public static List<BigDecimal> listImcDesPersonneDePlusDe25AnsEtDeMoinsDe70kg(List<Personne> personnes) {
		
		List<BigDecimal> imcList = personnes
				.stream()
				.filter(p -> p.getAge() > 25 && p.getPoids() < 70)
				.map(p -> new BigDecimal(p.getPoids() / (Math.pow(p.getTaille(), 2))))
				.collect(Collectors.toList())
				;
		
		return imcList;
		
	}
	
	public static Map<String, BigDecimal> mapImcDesPersonneDePlusDe25AnsEtDeMoinsDe70kg(List<Personne> personnes) {
		
		Map<String, BigDecimal> imcMap = personnes
				.stream()
				.filter(p -> p.getAge() > 25 && p.getPoids() < 70)
				.collect(Collectors.toMap(p -> p.getName(), p -> new BigDecimal(p.getPoids() / (Math.pow(p.getTaille(), 2)))));
				;
		
		return imcMap;
		
	}

}
