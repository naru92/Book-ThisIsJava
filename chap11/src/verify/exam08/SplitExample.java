package verify.exam08;

import java.util.*;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		String[] tokens = str.split(",");
		for(String token :  tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		StringTokenizer st = new StringTokenizer(str , ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
