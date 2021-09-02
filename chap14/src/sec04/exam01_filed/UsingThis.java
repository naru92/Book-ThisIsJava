package sec04.exam01_filed;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int inerField = 20;
		
		void method() {
			MyFunctionalInterface fi = ()->{
				System.out.println("outterField: " + outterField);
				System.out.println("inerField: " + inerField);
			};
			fi.method();
		}
	}
}
