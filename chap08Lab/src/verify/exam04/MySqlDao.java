package verify.exam04;

public class MySqlDao implements DataAccessObject {
	String dbname = "MySql DB"; 
	
	@Override
	public void select() {
		System.out.println(dbname+"에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println(dbname+"에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println(dbname+"를 수정");
	}
	
	@Override
	public void delete() {
		System.out.println(dbname+"에서 삭제");
	}
}

