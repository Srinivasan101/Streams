package streams_Parallel;

import java.util.Arrays;
import java.util.List;

class Mobile{
	
	String brand;
	int price;
	
	public Mobile(String brand , int price) {
		
		this.brand = brand;
		this.price = price;
	}
		public String getBrand() {
			return this.brand;
		}
		public int getPrice() {
			return this.price;
		}
	}


public class Parallel {

	public static void main(String[] args) {
		
		List <Mobile> tech = Arrays.asList(
											new Mobile ("Redmi" , 15000),
											new Mobile ("Realme" , 16000),
											new Mobile ("Samsung" , 25000),
											new Mobile ("Poco" , 10000),
											new Mobile ("Oppo" , 35000),
											new Mobile ("Apple" , 95000),
											new Mobile ("Micromax" , 12000),
											new Mobile ("Lava" , 19000));
		
		// stream produce result in sequence way
		tech.stream().filter(x -> x.getPrice() > 15000).limit(4).forEach(x -> System.out.println(x.getBrand() + " " + x.getPrice()));
		
		// parallel stream produce result equal way
		tech.parallelStream().filter(x -> x.getPrice() > 15000).limit(3).forEach(x -> System.out.println(x.getBrand() + " " + x.getPrice()));
		
		// Convert stream to parallel stream
		tech.stream().parallel().filter(x -> x.getPrice() > 20000).limit(2).forEach(x -> System.out.println(x.getBrand() +" " + x.getPrice()));
			
	}

}
