package verify.exam04;

public class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySqlDao DB���� �˻�");
		
	}
	@Override
	public void insert() {
		
		System.out.println("MySqlDao DB���� ����");
		
	}
	@Override
	public void update() {
	
		System.out.println("MySqlDao DB���� ����");
		
	}
	@Override
	public void delete() {
		
		System.out.println("MySqlDao DB���� ����");
		
	}
	
}
