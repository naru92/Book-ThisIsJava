package sec06.exam03_newinstance;

public class NewinstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec06.exam03_newinstance.SendAction");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
