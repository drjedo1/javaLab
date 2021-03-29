package sec04.exam01_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit; 
//		1 - 7 * 0.1 = 1 - 0.7 = 0.3
		System.out.println(result); // 0.29999999999999993
		// 이유는 pieceUnit의 0.1이 0.1이 아니라 근사값입니다.

		
		
	}

}
