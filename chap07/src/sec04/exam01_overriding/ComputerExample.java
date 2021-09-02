package sec04.exam01_overriding;

public class ComputerExample {
	public static void main(String[] args) {
		int r =10;
		Calculator calculator = new Calculator();
		System.out.println("원먼젹: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원먼젹 : " + computer.areaCircle(r));
		
	}
}
