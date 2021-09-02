package sec11.exam01_arryas;

public class Member implements Comparable<Member>{
	String name;
	
	Member(String name){
		this.name =name;
	}

	@Override
	public int compareTo(Member o) {
		
		return name.compareTo(o.name);
	}
}
