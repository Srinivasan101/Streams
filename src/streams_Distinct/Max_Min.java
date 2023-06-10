package streams_Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Max_Min {

	public static void main(String[] args) {
		
		List <Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long size = num.stream().distinct().filter(n -> n%2 == 0).count();
		System.out.println(size);
		
		Optional <Integer> minimum = num.stream().min((x , y) -> {return x.compareTo(y);});
		System.out.println("Minimum Value is : " + minimum.get());
		
		Optional <Integer> maximum = num.stream().max((x , y) -> {return x.compareTo(y);});
		System.out.println("Maximum element is : " + maximum.get());
	}

}
