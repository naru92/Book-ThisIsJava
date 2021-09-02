package sec02_runtime_exception;

public class ArrayIndexOutOfBoundException {
	
	
	
	public static void main(String[] args) {
		if(args.length == 2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("arg[o]: " + data1);
		System.out.println("arg[1]: " + data2);
		}else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundExceptionExample ");
			System.out.println("값1 값2");
		}
	}
}
