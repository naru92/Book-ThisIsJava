package sec07_exam02_method;

public class StringToLowerUpperCaseExample {
	
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); //자바언어는 알파벳 대소문자를 구별 (서로 다른것으로 인식)
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2)); //대소문자 상관없이 비교
		
		
	}

}
