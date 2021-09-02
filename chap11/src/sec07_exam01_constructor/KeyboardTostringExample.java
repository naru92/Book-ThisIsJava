package sec07_exam01_constructor;

public class KeyboardTostringExample {
		public static void main(String[] args) throws Exception{
			byte[] bytes = new byte[100];
			
			System.out.print("입력 : ");
			int readByteNo = System.in.read(bytes); //read가 배열저장
			
			String str = new String(bytes, 0, readByteNo-2);
			System.out.println(str);
			
		}

}
