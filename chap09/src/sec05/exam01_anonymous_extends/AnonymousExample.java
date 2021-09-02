package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
	    		String studentNo;
	    		void walk() {
	    			System.out.println("��å�մϴ�.");			
	    		}
	    		@Override
	    		void wake() {
	    			System.out.println("7�ÿ� �Ͼ�ϴ�.");
	    			walk(); //�͸� �ڽİ�ü �������� �޼ҵ� �������� (�ַ� �����Ǹ� ������ �Ҷ� ���)
	    		}
			
		});
	}
}
