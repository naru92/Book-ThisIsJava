package sec07.exam01_why_default_method;

public class MyClassB implements Myinterface{
	
	@Override
	public void method1() {
		System.out.println("myclassA - method1() 실행");
	
  }
	
	@Override
	public void method2() {
		System.out.println("myclassB - method2() 실행");
	}
}
