package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�:"+thread.getName());
		
		Thread threadA = new ThreadA();
		threadA.start();
		System.out.println("�۾�������:"+threadA.getName());
		System.out.println();
		
		Thread threadB= new ThreadB();
		System.out.println("�۾��� ������:"+threadB.getName());
		threadB.start();
		
		
	}
}
