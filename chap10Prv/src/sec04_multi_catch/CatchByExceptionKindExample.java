package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			// 위에서 Exception이라고 써버리면 다 걸려버려서 밑에서 상세 오류가 걸릴 틈이 없다.
			// ArrayIndexOutOfBounds
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 매개값의 수가 부족합니다.");
		
			//NumberFormat
		}catch(NumberFormatException e) {
			e.printStackTrace();
//			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요");
			
		}
	}

}
