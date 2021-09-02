package sec03.exam03_localcalss_access;

public class Outter {
	//자바7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner{
			void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바8이후
	public void method2(int arg) {
		int localVariable = 1; 
		class Inner{
			void method() {
				int result = arg + localVariable;
			}
		}
	}
	
}
