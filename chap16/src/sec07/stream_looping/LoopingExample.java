package sec07.stream_looping;

import java.util.*;

public class LoopingExample {
	public static void main(String[] args) {
		
	
		int[] intArr= {1,2,3,4,5};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a->a%2==0)
			.peek(n->System.out.println(n)); //동작 x
		
		int total = Arrays.stream(intArr)
		.filter(a->a%2==0)
		.peek(n->System.out.println(n))
		.sum();
		System.out.println("총합" + total);
		}
}
