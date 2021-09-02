package sec02.exam01_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		DmbCellphone dmbCellPhone = new DmbCellphone("자바폰", "검정", 10);
				
		System.out.println("모델 : " + dmbCellPhone.model);		
		System.out.println("색상 : " + dmbCellPhone.color);
		
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다");
		dmbCellPhone.hanhUp();
		
		dmbCellPhone.turnOnDmb(); 
		dmbCellPhone.changeChannelDmb(3);
		dmbCellPhone.turnOffDmb();
		
	}
}
