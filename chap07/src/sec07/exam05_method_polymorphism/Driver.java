package sec07.exam05_method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		//vehicle을 상속받은 여러개체가 들어올수 있다 생각해야함
	}
}
