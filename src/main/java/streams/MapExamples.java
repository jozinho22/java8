package streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapExamples {
	
	public static List<String> mapToUpperCase(List<String> strings) {
		
		List<String> tuUpperCase = 
				strings.stream()
				.map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		
		return tuUpperCase;
	}
	


}
