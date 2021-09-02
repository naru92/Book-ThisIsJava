package sec04.exam01_unsynchronized;

public class Calculator {
	private int momory;

	public int getMomory() {
		return momory;
	}

	public void setMomory(int momory) {
		this.momory = momory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.momory);	
			
	}
	
	
}
