package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus(); // Vehicle 인터페이스의 구현객체
		Taxi taxi = new Taxi(); // Vehicle 인터페이스의 구현객체
		
		// 인터페이스 타입에 구현객체들을 대입하여 다형성을 구현한다.
		//Vehicle vehicle = bus
//		The method drive(Vehicle) in the type Driver is not applicable for the arguments (Bus)
		driver.drive(bus); // 자동형 변환, Vehicle vihicle = bus;
		driver.drive(taxi);
		
	}

}
