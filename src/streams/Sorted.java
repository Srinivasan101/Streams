package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		
		List <String> prime = Arrays.asList("Srini","Hari","Rajesh", "Mani") ;
		
		List <String> ascending = prime.stream().sorted().collect(Collectors.toList());
		
		System.out.println(ascending);
		
		List <String> desending = prime.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(desending);
		
		
		List <Integer> num = Arrays.asList(1,2,5,6,7,8,4,3,10);
		
		List <Integer> ascend = num.stream().sorted().collect(Collectors.toList());
		
		System.out.println(ascend);
		
		List <Integer> desend = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(desend);

	}

}
