package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalcu = new Calculator();
		// 소스 저장 안하니깐 객체 선언이 안되서 오류 발생했다.
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이="+result1);
		System.out.println("직사각형 넓이="+result2);
		
		
		
	}

}
