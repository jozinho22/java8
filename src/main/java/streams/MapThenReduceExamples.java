package streams;

import java.math.BigDecimal;
import java.util.List;

import model.Product;

public class MapThenReduceExamples {
	
	public static BigDecimal getTotalAmout(List<Product> products) {
		
		BigDecimal sum = products.stream()
                .map(x -> x.getQty().multiply(x.getPrice()))    // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);      // reduce

		return sum;
		
	}

}
