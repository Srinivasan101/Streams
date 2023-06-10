package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_demo {

	public static void main(String[] args) {
		
		List <String> words = Arrays.asList("Key","Cup", null , "Pen","Book", "Note", null);
		List <String> result = words.stream().filter(w -> w != null).collect(Collectors.toList());
		System.out.println(result);

	}

}
