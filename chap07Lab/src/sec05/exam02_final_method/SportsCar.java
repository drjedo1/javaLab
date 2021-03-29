package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
} // class ends 

// 필드에 final 붙이면