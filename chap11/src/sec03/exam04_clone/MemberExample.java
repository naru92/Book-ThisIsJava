package sec03.exam04_clone;

public class MemberExample {
	public static void main(String[] args) {
		
		Member original = new Member("blue", "Ȧ�浿", "12345", 25, true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id " + original.id);
		System.out.println("id " + original.name);
		System.out.println("id " + original.password);
		System.out.println("id " + original.age);
		System.out.println("id " + original.adult);
		
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id " + cloned.id);
		System.out.println("id " + cloned.name);
		System.out.println("id " + cloned.password);
		System.out.println("id " + cloned.age);
		System.out.println("id " + cloned.adult);
	
	}
}
