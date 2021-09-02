package sec05.exam02_anonymous_implements;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1();
		
		
		anony.method2(new RemoteControl() {
			
			public void turnOn() {
				System.out.println("SmartTV�� �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV�� ���ϴ�.");
				
				
		      }
		});
		
	}
}
