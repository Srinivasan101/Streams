package streams_Map;

import java.util.Arrays;
import java.util.List;

public class Map_Length {

	public static void main(String[] args) {
		
		List <String> cars = Arrays.asList("TATA", "HYNDAI", "MAHINDRA", "MARUTHI SUZUKI", "FORD", "KIA", "HONDA");
		
		//cars.stream().map(n -> n.length()).forEach(n -> System.out.println(n));
		
		cars.stream().map(n -> n.length()).forEach( System.out::println);

	}

}
