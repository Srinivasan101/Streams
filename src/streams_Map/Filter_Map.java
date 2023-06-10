package streams_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class Filter_Map {

	public static void main(String[] args) {
		
	List <Employee > emp = Arrays.asList(new Employee (101, "Mukil", 40000),
										new Employee (102, "Arivu", 50000),
										new Employee (103, "Anbu", 60000),
										new Employee (104, "Kayal", 30000),
										new Employee (105, "Kotravai", 80000));
	
	List <Integer > bonus = new ArrayList<Integer>();
	
	bonus = emp.stream().filter(s -> s.salary >= 40000).map(s -> s.salary / 10).collect(Collectors.toList());
	
	System.out.println(bonus);
	
	//i was used 10% bonus to each employee, who get salary greater then or equal to 40000. 
	}

}
