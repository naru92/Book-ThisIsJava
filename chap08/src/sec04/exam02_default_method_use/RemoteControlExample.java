package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television(); 
		rc.turnOn();
		rc.setMute(true); //구현객체가 대입된 이후 디폴트 메소드 사용 가능
		
		// RemoteControl.setMute(true); <<구현객체를 먼저 대입해야 하는데 인터페이스.으로 바로 접근 불가
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		//인터 페이스 타입으로 정의했지만, 실제적 호출은 오디오 클래스의 재정의된 turnOn과 setMute가 호출됨
				
  }
	
}
