package sec02.exam03_abstact_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn(); //public abstract �� ������ ����
	void turnOff();
	void setVolume(int volume);
	 
	
}
