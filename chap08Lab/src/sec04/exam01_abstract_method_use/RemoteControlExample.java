package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로컬변수 rc는 RemoteControl 인터페이스 타입이다.

		RemoteControl rc = null;
		
//		Television 구현 객체
		rc = new Television();
		rc.turnOn(); // Television 객체의 turnOn() 실제 메소드가 실행되는 것이다.
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn(); // Audio 객체의 turnOn() 실제 메소드가 실행되는 것이다.
		rc.turnOff();
		
	}

}
