package streams_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Upper {

	public static void main(String[] args) {
		
		List <String> bike = Arrays.asList("Yamaha", "Hero", "Honda", "Tvs", "Duke", "Ktm");
		
		List <String> upper_Bike = new ArrayList <String> ();
		
		upper_Bike = bike.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upper_Bike);
		
	}

}
