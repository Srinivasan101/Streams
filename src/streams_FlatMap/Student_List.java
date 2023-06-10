package streams_FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	char grade;
	
	public Student(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade= grade;
	}
	
}
public class Student_List {

	public static void main(String[] args) {
		
		List <Student> sslc = new ArrayList <Student> ();
		sslc.add(new Student (101, "Srini", 'A'));
		sslc.add(new Student (102, "Mani", 'B'));
		sslc.add(new Student (103, "Rajesh", 'C'));
		
		List <Student> hsc = new ArrayList <Student> ();
		hsc.add(new Student (104, "Hari", 'A'));
		hsc.add(new Student (105, "Vishnu", 'B'));
		hsc.add(new Student (106, "Vijay", 'B'));

		List <List <Student>> topper = Arrays.asList(sslc,hsc);
		
		/*for (List <Student> top : topper) {
			for (Student pro : top) {
				System.out.println(pro.name);
			}
	}*/
		List <String> overall = topper.stream().flatMap(n -> n.stream()).map(n -> n.name).collect(Collectors.toList());
		System.out.println(overall);
	}

}
