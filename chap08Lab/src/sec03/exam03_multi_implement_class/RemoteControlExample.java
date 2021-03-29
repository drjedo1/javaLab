package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tv 변수에 다중구현객체를 생성하여 대입한다.
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; // RemoteControl 인터페이스 타입에 대입한다.
		Searchable searchable = tv; // Searchable 인터페이스 타입에 대입
	}

}
