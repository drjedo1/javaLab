package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus(); // Vehicle �������̽��� ������ü
		Taxi taxi = new Taxi(); // Vehicle �������̽��� ������ü
		
		// �������̽� Ÿ�Կ� ������ü���� �����Ͽ� �������� �����Ѵ�.
		//Vehicle vehicle = bus
//		The method drive(Vehicle) in the type Driver is not applicable for the arguments (Bus)
		driver.drive(bus); // �ڵ��� ��ȯ, Vehicle vihicle = bus;
		driver.drive(taxi);
		
	}

}
