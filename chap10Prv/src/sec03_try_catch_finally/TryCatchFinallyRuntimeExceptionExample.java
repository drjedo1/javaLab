package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
		try {
//			 예외발생 가능한 코드 기입
			data1 = args[0];
			data2 = args[1];
			
		} catch(ArrayIndexOutOfBoundsException e) {
//			 예외처리 코드 기입
			System.out.println("실행 매개값의 수가 부족합니다.");
		} finally {
//			무조건 실행하는 코드
			System.out.println("다시 실행하세요.");
		}
		
	}

}
