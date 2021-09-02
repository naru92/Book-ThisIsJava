package sec03.exam02_noname_implement_class;


public class RemoteControlExample {
	public static void main(String[] args) {
		
	
	RemoteControl rc = new RemoteControl() {

		
		@Override
		public void turnOn() {}

		@Override
		public void turnOff() {}
		@Override
		public void setVolume(int volume) {}
		
		
	}; //인터페이스 중괄호 밖에선 사용 불가
RemoteControl rc2 = new RemoteControl() {

		
		@Override
		public void turnOn() {}

		@Override
		public void turnOff() {}
		@Override
		public void setVolume(int volume) {}
		
		
	}; //인터페이스 중괄호 밖에선 사용 불가
	
  }

}