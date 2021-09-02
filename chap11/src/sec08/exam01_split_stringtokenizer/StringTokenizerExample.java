package sec08.exam01_split_stringtokenizer;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens ; i++) {
			String token = st.nextToken();
			System.out.println(token); //기존 스트링토큰은 재활용이 안됨
		}
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token); //이 방법을 더 많이 사용
		}
		
	}
}
