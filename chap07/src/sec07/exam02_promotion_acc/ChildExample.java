package sec07.exam02_promotion_acc;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		
		parent.method2(); // �θ�Ŭ������ �޼ҵ�2 �� �־
		                  //  �����ǵ� �޼ҵ尡 ȣ���
	//	parent.method3(); child�� �޼ҵ�3�� �־ �θ�Ŭ����Ÿ���̹Ƿ�
	//                     ȣ���� �Ұ��ϴ�.
	}
}
