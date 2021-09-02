package sec05.exam02_field_array;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();
		
		System.out.println("----------------------------------");
		
		myCar.tires[0] = new KumhooTire();
		myCar.tires[1] = new KumhooTire();
		
		myCar.run();
		
		
	}
}
