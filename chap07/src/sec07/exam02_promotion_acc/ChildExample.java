package sec07.exam02_promotion_acc;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		
		parent.method2(); // 부모클래스에 메소드2 가 있어도
		                  //  재정의된 메소드가 호출됨
	//	parent.method3(); child에 메소드3이 있어도 부모클래스타입이므로
	//                     호출이 불가하다.
	}
}
