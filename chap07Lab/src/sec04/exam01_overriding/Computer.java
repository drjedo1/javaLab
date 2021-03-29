package sec04.exam01_overriding;

public class Computer extends Calculator {

	// 메소드 재정의(Method overriding)
	// 어노테이션 : 컴파일러에게 코드(재정의 여부) 검증을 요청한다.
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행");
//		return super.areaCircle(r);
		return Math.PI * r * r;
	}
	
//	@Override
	double area2Circle(double r) {
		return 1.0;
		
	}

	
	
}
