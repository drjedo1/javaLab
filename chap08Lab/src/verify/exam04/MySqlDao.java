package verify.exam04;

public class MySqlDao implements DataAccessObject {
	String dbname = "MySql DB"; 
	
	@Override
	public void select() {
		System.out.println(dbname+"���� �˻�");
	}
	
	@Override
	public void insert() {
		System.out.println(dbname+"�� ����");
	}
	
	@Override
	public void update() {
		System.out.println(dbname+"�� ����");
	}
	
	@Override
	public void delete() {
		System.out.println(dbname+"���� ����");
	}
}

