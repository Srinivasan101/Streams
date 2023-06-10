package streams_Distinct;

import java.util.Arrays;
import java.util.List;

public class Stream_Array {

	public static void main(String[] args) {
		
		List <String> num = Arrays.asList("A","B","C","1","2","3");
		
		Object arr [] =num.stream().toArray();
		
		System.out.println(arr.length);
		
		for(Object prime : arr) {
			System.out.println(prime);
		}

	}

}
