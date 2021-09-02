package sec07_exam02_method;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241203013";
		System.out.println(ssn.length());
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다");
		}else {
			System.out.println("주민번호 자리수가 틀립니다");
			
		}
		
	}
}
