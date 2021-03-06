package sec09.stream_aggregate;

import java.util.*;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/*double avg = list.stream()
				.MapToInt(Integer :: intValue)
				.average()
				.getAsDouble();*/
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("规过1_乞闭: " + optional.getAsDouble());
		}else{
			System.out.println("规过1_乞闭: 0.0");
		}
		
		
		double avg= list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.orElse(0.0);
		System.out.println("规过2_乞闭: " + avg);
		
		
		list.add(2);
		list.add(4);
		
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a-> System.out.println("规过3_乞闭: " + a));
		
	}
}
