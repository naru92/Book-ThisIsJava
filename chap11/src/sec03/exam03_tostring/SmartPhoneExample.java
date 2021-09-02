package sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone); 
		//tostring을 재정의 하는 이유는 수시로 객체의 값을 보기 위해, 한꺼번에 확인할떄 좋음
	}
}
