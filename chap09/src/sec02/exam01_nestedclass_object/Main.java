package sec02.exam01_nestedclass_object;

public class Main {
	public static void main(String[] args) {
		A a = new A(); //�ݵ�� A��ü�� ���������
		
		A.B b = a.new B(); //�̷������� B�� ��ü ������ ����
		b.field1 =3;
		b.method1();
		
		
		A.C c= new A.C();
		
		c.field1 = 3;
		c.method1();
		A.C.field2=3;
		A.C.method2();
		
		a.method(); //a.method�� ����  ���ø޼ҵ�� �����Ѵ��� D�� ȣ�� 
					//D�� ���� ������ �Ұ�
		
		
	}
}
