package streams_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Arithmatic {

	public static void main(String[] args) {
		
		List <Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		List <Integer> divided = new ArrayList <Integer>();
		
		divided = numbers.stream().map(num -> num / 2).collect(Collectors.toList());
		System.out.println(divided);
		
		//we can also use another two types here.
	}

}
