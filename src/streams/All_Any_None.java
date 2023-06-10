package streams;

import java.util.HashSet;
import java.util.Set;

public class All_Any_None {

	public static void main(String[] args) {
		
		Set <String> brand = new HashSet<String>();
		
		brand.add("Honda Bike");
		brand.add("Honda Car");
		brand.add("Bmw Bike");
		brand.add("Bmw Car");
		brand.add("Ola Bike");
		brand.add("Ola Car");
		
		boolean bool = brand.stream().anyMatch(x -> {return x.startsWith("Bmw");});
		
		System.out.println(bool); // if any one match return true
		
		bool = brand.stream().allMatch(x -> { return x.startsWith("Honda");});
		
		System.out.println(bool); // if all match return true else false
		
		bool = brand.stream().noneMatch(x -> {return x.startsWith("Ola");});
		System.out.println(bool); // no one element doesn't start with "xxxx" then return true, we already have Ola so its return false if we don't have its return true
	}

}
