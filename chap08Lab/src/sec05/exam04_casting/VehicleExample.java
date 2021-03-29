package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 변수 = 구현객체, 자동타입변환
	Vehicle vehicle = new Bus();
	
	vehicle.run();

//		The method checkFare() is undefined for the type Vehicle
//	vehicle.checkFare();
	
	Bus bus = (Bus) vehicle; // 강제형변환, 구현 클래스 형 <- 인터페이스형
	bus.run();
	bus.checkFare();
	
	}

}
