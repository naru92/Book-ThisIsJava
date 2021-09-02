package sec13.exam02_random;

import java.util.*;

public class RandomExaple {
	public static void main(String[] args) {
		
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(); //난수값을 주면 고정 냅두면 시스템 시간에따라 난수 변경
		System.out.print("선택번호 :");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
			
		}
		System.out.println();
		
		//당첨 번호
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("당첨 번호:");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
			
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("★당첨여부★");
		if(result) {
			System.out.println("축 1등 당첨");
		}else {
			System.out.println("당첨되자않았습니다.");
		}
		
	}
}
