package sec02.exam01_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		DmbCellphone dmbCellPhone = new DmbCellphone("�ڹ���", "����", 10);
				
		System.out.println("�� : " + dmbCellPhone.model);		
		System.out.println("���� : " + dmbCellPhone.color);
		
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�");
		dmbCellPhone.hanhUp();
		
		dmbCellPhone.turnOnDmb(); 
		dmbCellPhone.changeChannelDmb(3);
		dmbCellPhone.turnOffDmb();
		
	}
}
