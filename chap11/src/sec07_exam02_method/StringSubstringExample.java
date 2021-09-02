package sec07_exam02_method;

public class StringSubstringExample {
	
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6); // 지정값에서 지정값 까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //지정값부터 끝까지
		System.out.println(secondNum);
		
		
	}

}
