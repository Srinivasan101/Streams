package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny_FindFirst {

	public static void main(String[] args) {
		
		List <String> words = Arrays.asList("one","two","three","four","five");

		Optional <String> choose = words.stream().findAny();
		
		System.out.println(choose.get());
		
		Optional <String> choice = words.stream().findFirst();
		
		System.out.println(choice.get());
		
		
	}

}
