package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로컬변수 rc는 RemoteControl 인터페이스 타입이다.

		RemoteControl rc;
		rc = new Television(); // 인터페이스 변수 = 구현객체; 자동형변환
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		System.out.println("----------------");
		
		
		rc= new Audio(); // 인터페이스 타입 Audio 구현 객체, 자동형변환
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(false);
		rc.turnOff();
		
		// 추상메소드는 자식 클래스의 필드와 이름을 통일하여 효율성을 높인다.
		// 인터페이스는 기능들의 다형성을 구현한다.
		
	}

}
