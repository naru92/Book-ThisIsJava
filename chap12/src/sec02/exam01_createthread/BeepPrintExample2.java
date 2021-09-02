package sec02.exam01_createthread;

import java.awt.*;

public class BeepPrintExample2 {
	
	
	public static void main(String[] args) {
		//how1
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();*/
		
		//how2
		/*Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch (Exception e) {}
				   }
				
			}
		});
		
		thread.start();*/
		
		//how3
		Thread thread =new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch (Exception e) {}
			   }
			
		});
		
		thread.start();
		
		//"��" ���ڿ��� 5�� ����ϴ� �۾�
	for(int i=0; i<5; i++) {
		System.out.println("��");
		try {Thread.sleep(500);} catch (Exception e) {}
	  }
	}
	
  }

