package sec04.exam01_overriding;

public class ComputerExample {
	public static void main(String[] args) {
		int r =10;
		Calculator calculator = new Calculator();
		System.out.println("���ՠ�: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("���ՠ� : " + computer.areaCircle(r));
		
	}
}
