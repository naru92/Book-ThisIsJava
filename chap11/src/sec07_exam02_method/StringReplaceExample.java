package sec07_exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr); 
		System.out.println(newStr); //기존 객체를 바꾸는게 아닌 새로운 객체를 참조하고 리턴
		
		
		
	}
}
