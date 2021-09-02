package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","�ſ��","���ڹ�","���ٽ�","�ں���");
		
		
		//���� ó��
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample::print);
		
		System.out.println();
		
		//���� ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
		
	}
	
	public static void print(String str) {
		System.out.println(str+ ":" + Thread.currentThread().getName());
	}
}
