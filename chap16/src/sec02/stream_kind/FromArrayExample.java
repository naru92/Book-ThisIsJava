package sec02.stream_kind;
import java.util.*;
import java.util.stream.*;

public class FromArrayExample {

	public static void main(String[] args) {
		String[] strArray = {"ȫ�浿","�ſ��","��̳�"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(s->System.out.println(s + "."));
		
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(s->System.out.println(s + "."));

	}

}
