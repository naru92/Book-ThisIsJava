package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television(); 
		rc.turnOn();
		rc.setMute(true); //������ü�� ���Ե� ���� ����Ʈ �޼ҵ� ��� ����
		
		// RemoteControl.setMute(true); <<������ü�� ���� �����ؾ� �ϴµ� �������̽�.���� �ٷ� ���� �Ұ�
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		//���� ���̽� Ÿ������ ����������, ������ ȣ���� ����� Ŭ������ �����ǵ� turnOn�� setMute�� ȣ���
				
  }
	
}
