package sec03.exam01_member_class.access;

public class A {
	class B{}
	static class C{}
	
	//�ν��Ͻ� �ʵ�//
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�//
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//���� �ʵ�
	//static B field3 = new B(); �ν��Ͻ� �ɹ� Ŭ������ ������ A��ü ���� ���Ұ�
	static C field4 = new C();
	
	//���� �޼ҵ�
	static void method2() {
		//B var1 = new B(); ���͵���
		C var2 = new C();
	}
	
}