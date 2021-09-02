package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
	    		String studentNo;
	    		void walk() {
	    			System.out.println("산책합니다.");			
	    		}
	    		@Override
	    		void wake() {
	    			System.out.println("7시에 일어납니다.");
	    			walk(); //익명 자식객체 내에서만 메소드 실현가능 (주로 재정의를 간단히 할때 사용)
	    		}
			
		});
	}
}
