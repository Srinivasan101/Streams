package streams;

import java.util.ArrayList;
import java.util.List;


class Product{
	int id;
	String brand;
	int price;
	
	public  Product(int id, String brand, int price){
		
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
}

public class Filter_demo2 {

	public static void main(String[] args) {
		
		List <Product> list = new ArrayList <Product>();
		list.add(new Product (101,"Azus",25000));
		list.add(new Product (102,"Hp",35000));
		list.add(new Product (103,"Dell",45000));
		list.add(new Product (104,"msi",85000));
		list.add(new Product (105,"Apple",125000));
		
		list.stream()
						.filter(p -> p.price > 35000)
						.forEach(pr -> System.out.println(pr.price));
	}

}
