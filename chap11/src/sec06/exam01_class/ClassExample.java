package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName()); //패키지 명을 포함한 클래스 전체 이름
		System.out.println(clazz1.getSimpleName()); //클래스 이름만
		System.out.println(clazz1.getPackage().getName()); //패키지 이름만
		System.out.println();
		
		
		try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car"); //문자열로 얻기
			System.out.println(clazz2.getName()); 
			System.out.println(clazz2.getSimpleName()); 
			System.out.println(clazz2.getPackage().getName()); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
