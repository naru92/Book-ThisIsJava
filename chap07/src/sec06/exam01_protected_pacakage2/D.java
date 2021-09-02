package sec06.exam01_protected_pacakage2;

import sec06.exam01_protected_pacakage1.*;

public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method();
		
	} //상속시 자식클래스라면 다른 패키지에서도 사용 가능 
	
}
