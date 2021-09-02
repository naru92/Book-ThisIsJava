package sec03.exam01_parent_constructor_call;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모 객체 생성완료");
		//컴파일시 부모객체가 먼저 호출
	}
}
