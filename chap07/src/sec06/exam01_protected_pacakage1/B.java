package sec06.exam01_protected_pacakage1;

public class B {
	public void method() {
		A a = new A(); //같은 패키지기 떄문에 프로텍트 선언된 필드와 메소드 호출 가능
		a.field = "value";
		a.method();
	}
}
