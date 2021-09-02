package sec03.exam01_equals;

public class Member { //암시적으로 오브젝트를 상속
	public String id;
	
	public Member(String id) {
		this.id = id;
		
	}
	
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				Member member = (Member) obj;
				if(id.equals(member.id)) {
					return true;
				}
			}
			return false;
		}
		/*@Override
			public int hashCode() {
				return id.hashCode();*/
			
}
