package sec05.exam01_anonymous_extends;

public class Anonymous {
	
	Person field = new Person() {
		String studentNo;
		void work() {
			System.out.println("출근합니다.");			
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work(); //익명 자식객체 내에서만 메소드 실현가능 (주로 재정의를 간단히 할때 사용)
	  };
    };	
    
    
    void method1() {
    	Person localVar = new Person() {
    		String studentNo;
    		void study() {
    			System.out.println("공부합니다.");			
    		}
    		@Override
    		void wake() {
    			System.out.println("8시에 일어납니다.");
    			study(); //익명 자식객체 내에서만 메소드 실현가능 (주로 재정의를 간단히 할때 사용)
    	  };
    	};
    	localVar.wake();
    }
    
    void method2(Person person) {
    	person.wake();
    }
}
