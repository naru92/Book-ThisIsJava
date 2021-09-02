package sec02.stream_kind;

import java.util.*;
import java.util.stream.*;

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				
			new Student("홍길동",10),	
			new Student("신용권",20),	
			new Student("이미선",30)	
		);
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s->System.out.println(s.getName()));
		

	}

}
