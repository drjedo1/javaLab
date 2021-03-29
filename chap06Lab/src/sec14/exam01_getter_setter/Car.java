package sec14.exam01_getter_setter;



public class Car {

	//필드
	private int speed;
	private boolean stop;
		
	 //class car end
	
	//생성자
	//메소드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		} else { //if end
			this.speed = speed;
		} // else end
		// 이러한 검증하는 getter setter를 가지고 있지 않다면 속도로 마이너스 값을 넣는 등의 문제가 발생할 수 있다.
	} //setSpeed end	
		
		public boolean isStop() {
			return stop;
		} // isStop end
		public void setStop(boolean stop) {
			this.stop = stop;
			this.speed = 0;
		} // setStop end
		
		
	
	
	
} //getSpeed end
