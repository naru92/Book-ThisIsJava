package sec08.exam02_abstract_method;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍"); //추상메소드의 재정의는 자식클래스에서는 꼭 이루어져야한다
		
	}
	
	
}
