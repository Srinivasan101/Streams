package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concading_Stream {

	public static void main(String[] args) {
		
		List <String> animals = Arrays.asList("DOG", "CAT", "ELEPHANT");
		List <String> birds = Arrays.asList("PARROT", "PEACOCK", "CROW");
		
		Stream <String> x = animals.stream();
		Stream <String> y = birds.stream();
		
		List <String> z = Stream.concat(x, y).collect(Collectors.toList());
		
		for (String a : z) {
			System.out.println(a);
		}

	}

}
