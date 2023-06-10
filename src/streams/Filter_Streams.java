package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Streams {

	public static void main(String[] args) {
		//First way in filter methods
		
		List <Integer> number = Arrays.asList(10,15,20,25,30,35,40);
		List <Integer> even = new ArrayList <Integer> ();
		
		/*even = number.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(even);*/
		
		//number.stream().filter(n -> n%2 ==0).forEach(n -> System.out.println(n));;
		
		number.stream().filter(n -> n%2 == 0).forEach(System.out::println);
	}

}
