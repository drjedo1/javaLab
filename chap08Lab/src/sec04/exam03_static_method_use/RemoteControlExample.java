package sec04.exam03_static_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl.changeBattery(); // 정적 메소드 사용한다.
		// 정적 메소드는 객체를 만들지 않고 사용할수있지만
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		
		rc.setMute(true); // 익명 구현 객체를 생성한 후, 디폴트 메소드 사용한다.
	}

}
