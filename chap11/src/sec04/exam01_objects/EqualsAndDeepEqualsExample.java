package sec04.exam01_objects;

import java.util.*;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println();
		
		Integer[] arr1 = {1 , 2};
		Integer[] arr2 = {1 , 2};
		System.out.println(Objects.deepEquals(arr1, arr2)); //배열의 항목이 같으므로 트루
		System.out.println(Objects.deepEquals(null, arr2)); 
		System.out.println(Objects.deepEquals(arr1, null)); 
		System.out.println(Objects.deepEquals(null, null));
	}
}
