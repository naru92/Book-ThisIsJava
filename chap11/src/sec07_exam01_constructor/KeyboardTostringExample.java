package sec07_exam01_constructor;

public class KeyboardTostringExample {
		public static void main(String[] args) throws Exception{
			byte[] bytes = new byte[100];
			
			System.out.print("�Է� : ");
			int readByteNo = System.in.read(bytes); //read�� �迭����
			
			String str = new String(bytes, 0, readByteNo-2);
			System.out.println(str);
			
		}

}
