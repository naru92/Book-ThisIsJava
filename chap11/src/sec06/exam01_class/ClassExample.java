package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName()); //��Ű�� ���� ������ Ŭ���� ��ü �̸�
		System.out.println(clazz1.getSimpleName()); //Ŭ���� �̸���
		System.out.println(clazz1.getPackage().getName()); //��Ű�� �̸���
		System.out.println();
		
		
		try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car"); //���ڿ��� ���
			System.out.println(clazz2.getName()); 
			System.out.println(clazz2.getSimpleName()); 
			System.out.println(clazz2.getPackage().getName()); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}