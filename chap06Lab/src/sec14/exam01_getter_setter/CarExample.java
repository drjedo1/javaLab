package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(); // 이 코드를 이해하는게 중요하다. myCar라는 변수를 만들면서
		// Car 클래스 타입 변수를 만든것이다. new 키워드를 통해서 Car() 생성자를 통해서 객체를 만든다.
		// 객체 안에 필드가 있다. speed와 stop이 있다.
		
		myCar.setSpeed(-50);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
	}

}
