package sec10.stream_reduce;

import java.util.*;

public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student ("È«±æµ¿",92),
			new Student ("½Å¿ë±Ç",95),
			new Student ("±èÀÚ¹Ù",88)
				
		);
		
		int sum1 = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		
		int sum2 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce((a, b)->a+b)
				.getAsInt();
		
		int sum3 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce(0, (a, b)->a+b);
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);

	}

}
