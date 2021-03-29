package sec08.exam01_method.declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalc = new Calculator(); 
		// 맨 앞의 Calculator는 클래스 타입을 나타낸다.
		// myCalc 호출 변수
		
		// "." 입력해서 나오는 필드. 삼각형은 직접 작성한 것. 원형은 상속받은 메소드.
		myCalc.powerOn();
		// 이 컨셉이 중요하다. 객체를 만들어서 메소드를 호출한다.
		
		int result1 = myCalc.plus(5, 6); // result = 11
		System.out.println("result1="+result1);
		
		byte x = 10;
		byte y = 4;
//		myCalc.divide(x, y); // 자동 형변환 된다. byte->int
		double result2 = myCalc.divide(x, y); // 자동 형변환 된다. byte->int
		System.out.println("result2="+result2);
		
		myCalc.powerOff();
		
	}

}
