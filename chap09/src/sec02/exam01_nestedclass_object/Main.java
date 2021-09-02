package sec02.exam01_nestedclass_object;

public class Main {
	public static void main(String[] args) {
		A a = new A(); //반드시 A객체가 만들어져야
		
		A.B b = a.new B(); //이런식으로 B로 객체 생성이 가능
		b.field1 =3;
		b.method1();
		
		
		A.C c= new A.C();
		
		c.field1 = 3;
		c.method1();
		A.C.field2=3;
		A.C.method2();
		
		a.method(); //a.method를 통해  로컬메소드로 접근한다음 D로 호출 
					//D로 직접 접근은 불가
		
		
	}
}
