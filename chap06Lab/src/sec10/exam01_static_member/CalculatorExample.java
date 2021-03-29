package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 인스턴스 처럼 객체 만들지 않고 클래스.필드로 작성했다.
//		 Calculator.pi는 정적필드이다.
		double result1 = 10 * 10 * Calculator.pi;
		
//		 Calculator.plus()는 정적 메소드
		int result2 = Calculator.plus(10, 5);
				
//		myCal.minus()는 인스턴스 메소드
		Calculator myCal = new Calculator();
		int result3 = myCal.minus(10, 5);
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
	}

}
