package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			예외 발생 가능한 코드
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
//			 이 안에 들어가는게 예외 처리 코드
			System.out.println();
		} finally { // finally 생략 가능
			
		}
		
		
	}

}
