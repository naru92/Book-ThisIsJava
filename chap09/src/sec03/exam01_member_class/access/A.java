package sec03.exam01_member_class.access;

public class A {
	class B{}
	static class C{}
	
	//인스턴스 필드//
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드//
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드
	//static B field3 = new B(); 인스턴스 맴버 클래스기 떄문에 A객체 없이 사용불가
	static C field4 = new C();
	
	//정적 메소드
	static void method2() {
		//B var1 = new B(); 위와동일
		C var2 = new C();
	}
	
}
