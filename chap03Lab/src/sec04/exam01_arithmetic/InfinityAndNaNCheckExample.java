package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;

//		int y = 0;
//		int z = x / y;
//		java.lang.ArithmeticException: / by zero
		
		double y = 0.0;
		double z = x / y;
		double t = x % y; // 나머지 구하기 5 % 0.0 = NaN
		
//		무한과 nan값 검사하는 루틴
		if(Double.isInfinite(z) || Double.isNaN(t)) {    
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z);
			System.out.println(t);
			
			
		}
		
	}

}
