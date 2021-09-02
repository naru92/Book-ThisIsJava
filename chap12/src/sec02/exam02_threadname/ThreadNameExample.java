package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름:"+thread.getName());
		
		Thread threadA = new ThreadA();
		threadA.start();
		System.out.println("작업스레드:"+threadA.getName());
		System.out.println();
		
		Thread threadB= new ThreadB();
		System.out.println("작업ㅇ 스레드:"+threadB.getName());
		threadB.start();
		
		
	}
}
