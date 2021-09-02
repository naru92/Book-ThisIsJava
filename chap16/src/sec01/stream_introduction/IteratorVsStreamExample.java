package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		
		//���ͷ����� �̿� 
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		
		//Stream �̿�
		Stream<String> stream = list.stream();
		stream.forEach(name->System.out.println(name));
	}
}
