package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else { // if ends
			
			 // 부모(Airplane 객체)의 fly() 메소드를 실행한다.
			super.fly();
			
		} // else ends

	
		
		
	} //fly() ends
} //class ends
