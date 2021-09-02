package sec11.exam01_arryas;

import java.util.*;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		
		//얕은 복사후 비교
		System.out.println("[얕은 복사후 비교]");
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println("배열번지비교 :" + original.equals(clone1));
		System.out.println("1차 배열 항목값 비교 :" + Arrays.equals(original, clone1));
		System.out.println("중첩 배열 항목값 비교 :" + Arrays.deepEquals(original, clone1));
		
		//깊은 복사후 비교
		System.out.println("\n[얕은 복사후 비교]");
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[0], original[1].length);
		System.out.println("배열번지비교 :" + original.equals(clone2));
		System.out.println("1차 배열 항목값 비교 :" + Arrays.equals(original, clone2));
		System.out.println("중첩 배열 항목값 비교 :" + Arrays.deepEquals(original, clone2));
		
	}
	
}
