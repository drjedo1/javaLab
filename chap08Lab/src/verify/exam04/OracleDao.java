package verify.exam04;

public class OracleDao implements DataAccessObject {
	String dbname = "Oracle DB"; 
	
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
