package streams_Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduced {

	public static void main(String[] args) {
		
		List <String> words = Arrays.asList("A","B","C", "1", "2", "3");
		
		Optional <String> pro =words.stream().reduce((x , y) -> {return x+y ;});
		System.out.println(pro.get());

	}

}
