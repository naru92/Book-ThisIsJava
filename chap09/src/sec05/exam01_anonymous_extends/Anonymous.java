package sec05.exam01_anonymous_extends;

public class Anonymous {
	
	Person field = new Person() {
		String studentNo;
		void work() {
			System.out.println("����մϴ�.");			
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work(); //�͸� �ڽİ�ü �������� �޼ҵ� �������� (�ַ� �����Ǹ� ������ �Ҷ� ���)
	  };
    };	
    
    
    void method1() {
    	Person localVar = new Person() {
    		String studentNo;
    		void study() {
    			System.out.println("�����մϴ�.");			
    		}
    		@Override
    		void wake() {
    			System.out.println("8�ÿ� �Ͼ�ϴ�.");
    			study(); //�͸� �ڽİ�ü �������� �޼ҵ� �������� (�ַ� �����Ǹ� ������ �Ҷ� ���)
    	  };
    	};
    	localVar.wake();
    }
    
    void method2(Person person) {
    	person.wake();
    }
}
