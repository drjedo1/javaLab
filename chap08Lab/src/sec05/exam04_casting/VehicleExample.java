package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽� ���� = ������ü, �ڵ�Ÿ�Ժ�ȯ
	Vehicle vehicle = new Bus();
	
	vehicle.run();

//		The method checkFare() is undefined for the type Vehicle
//	vehicle.checkFare();
	
	Bus bus = (Bus) vehicle; // ��������ȯ, ���� Ŭ���� �� <- �������̽���
	bus.run();
	bus.checkFare();
	
	}

}
