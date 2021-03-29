package sec04.exam01_arithmetic;

public class AccuraryExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int apple = 1; int totalPieces = apple * 10; int number = 7;
		 * 
		 * int temp = totalPieces - number; // 3
		 * 
		 * double result = temp / 10.0;
		 * 
		 * System.out.println(result);
		 */		
		
		int apple = 1;
//		double pieceUnit = 0.1;
//		int pieceUnit = 0.1;
		int pieceUnit = 1; 
		// 1/10 0.0 이 나온 이유. 정수 나누기 정수이기 때문에.
		// 근데 나누기 써도 결과 값은 처음처럼 0.29999999999999993 나옴.
		// 결국 int 써야됨.
		
		
		int number = 7;
		
		double result = (apple * 10 - number * pieceUnit)/10.0;
//		1 - 7 * 0.1 = 1 - 0.7 = 0.3
		
//		(1*10 - 7*1)/10.0 = 0.3 
		System.out.println(result); 
		
		// 0.29999999999999993
		// 이유는 pieceUnit의 0.1이 0.1이 아니라 근사값입니다.
		
		// 결론은 정확한 계산을 위해서는 중간 계산 값에 소수를 넣으면 안되고
		// 정수로 계산 마치고 나서 마지막에 나눠야지 정확한 0.3 즉 소수값이 잘 나옴.
		
		System.out.println(pieceUnit);
		
		
		// -------------------------------------
		
		/*
		 * //double x = 5 / 0; // 예외 발생 double y = 5 / 0.0; //Infinity double z = 5 %
		 * 0.0; //NaN Double.isInfinite(y); //true Double.isNaN(z); //true
		 * 
		 * System.out.println("________________"); //System.out.println(x);
		 * System.out.println(y); System.out.println(z);
		 * System.out.println(Double.isInfinite(y));
		 * System.out.println(Double.isNaN(z));
		 */
	}

}