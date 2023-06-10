package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Stream2 {

	public static void main(String[] args) {
		
		List <String> name = Arrays.asList("Srini", "Raj" , "Hari", "Mani", "Rajesh");
		List <String> max = new ArrayList<String>();
		
	//	max = name.stream().filter(str -> str.length()<7 && str.length() > 3).collect(Collectors.toList());
		// System.out.println(max);
		
		//name.stream().filter(str -> str.length() > 4 && str.length() < 7).forEach(str -> System.out.println(str));
		name.stream().filter(str -> str.length() > 4 && str.length() < 7).forEach( System.out::println);
	}

}
