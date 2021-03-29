package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		Vehicle v = bus;
		
		//매개변수 다형성. bus도 넣을 수 있고, taxi도 넣을 수 있다.
		driver.drive(bus); // 자동형변환, 부모형 <- 자식형 
		driver.drive(taxi);
	}

}
