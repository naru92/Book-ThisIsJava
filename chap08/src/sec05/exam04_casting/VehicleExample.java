package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
	   //vehicle.checkFare(); 호출불가 비허클에 없기때문에
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}
}
