package verify.exam04;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		}
		public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		} // main ends
		} // class ends
	
// DaoExample 클래스는 main() 메소드에서 dbWork() 메소드를 호출할 때 
// OracleDao와 MySqlDao 객체를 매개값으로 주고 호출했습니다. 
// dbWork() 메소드는 두 객체를 모두 매개값으로 받기 위해 
// DataAccessObject 타입의 매개 변수를 가지고 있습니다. 

// 실행 결과를 보고 DataAccessObject 인터페이스와 
// OracleDao, MySqlDao 구현 클래스를 각각 작성해 보세요.

// 실행 결과
		// Oracle DB에서 검색
		// Oracle DB에 삽입
		// Oracle DB를 수정
		// Oracle DB에서 삭제
		// MySql DB에서 검색
		// MySql DB에 삽입
		// MySql DB를 수정
		// MySql DB에서 삭제