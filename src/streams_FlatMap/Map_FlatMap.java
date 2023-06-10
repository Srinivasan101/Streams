package streams_FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_FlatMap {

	public static void main(String[] args) {
		
		//MAP
		
		List <Integer> pro = Arrays.asList(1,2,3,4,5,6,7,8);
		List <Integer> prime = new ArrayList<Integer> ();
		
		prime = pro.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(prime);
		
		//FLATMAP
		
		List <Integer> list = Arrays.asList(1,2);
		List <Integer> list1 = Arrays.asList(3,4);
		List <Integer> list2 = Arrays.asList(5,6);
		
		List<List<Integer>> num = Arrays.asList(list,list1,list2);
		List <Integer> result = new ArrayList <Integer> ();
		
		result = num.stream().flatMap(n -> n.stream()).map(n-> n *4).collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
