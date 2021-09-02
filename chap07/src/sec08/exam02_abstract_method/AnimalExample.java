package sec08.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("----------------------------------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound(); //타입 변환이 이루어져도 재정의된 도그클래스의 값이 들어감
		
		animal = new Cat();
		animal.sound(); //위와 동일
		
		 animalSound(new Dog());
		 animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
