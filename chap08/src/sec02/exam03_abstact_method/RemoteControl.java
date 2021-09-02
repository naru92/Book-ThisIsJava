package sec02.exam03_abstact_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn(); //public abstract 가 생략된 상태
	void turnOff();
	void setVolume(int volume);
	 
	
}
