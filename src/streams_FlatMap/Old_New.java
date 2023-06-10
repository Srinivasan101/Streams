package streams_FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Old_New {

	public static void main(String[] args) {
		
		List <String> Chennai = Arrays.asList("Ashwin", "Vijay Shankar", "Natarajan");
		List <String> Mumbai = Arrays.asList("Sachin", "Surya Kumar", "Ruthuraj");
		List <String> U19 = Arrays.asList("Dhoni(C)", "Virat(VC)", "Jadeja");
		
		List<List<String>> cricket = new ArrayList <List<String>>();
		cricket.add(Chennai);
		cricket.add(Mumbai);
		cricket.add(U19);
		
		//BEFORE JAVA EIGHT OLD
		
		/*for (List<String> pro : cricket) {
			for(String prime :pro) {
				System.out.println(prime);
			}
		}*/
		
		//AFTER JAVA EIGHT
		
		List<String> prime = cricket.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		
		System.out.println(prime);
		
		
	}

}
