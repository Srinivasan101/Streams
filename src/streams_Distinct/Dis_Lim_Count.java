package streams_Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Distinct // Limit // Count
public class Dis_Lim_Count {

	public static void main(String[] args) {
		
		List <String> bike = Arrays.asList("Hero", "Honda", "Tvs","Tvs", "Yamaha", "Royal Enfield","Yamaha");
		
		List <String> brand = bike.stream().distinct().collect(Collectors.toList());
		System.out.println(brand);
		
		bike.stream().distinct().forEach(n -> System.out.println(n));
		 
		List <String> size = bike.stream().distinct().limit(4).collect(Collectors.toList());
		System.out.println(size);
		
		long count = bike.stream().distinct().count();
		System.out.println(count);
	}

}
