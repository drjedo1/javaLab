package sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i=1; i<=5; i++)
			int problemLocation = car.run();
		switch(problemLocation) {
		case 1:
			System.out.println("�տ��� HanKookTire�� ��ü");
			car.frontLeftTire = new HankookTire("�տ���", 15); // �ڵ�����ȯ, �θ��� <- �ڽ���
			break;
		case 2:
			System.out.println("�տ����� KumhoTire�� ��ü");
			car.frontLeftTire = new HankookTire("�տ�����", 13);
			break;
		case 3:
			System.out.println("�ڿ��� HanKookTire�� ��ü");
			car.backLeftTire = new HankookTire("�ڿ���", 14);
			break;
		case 4:
			System.out.println("�ڿ����� KumhoTire�� ��ü");
			car.backLeftTire = new HankookTire("�ڿ�����", 17);
			break;
		}
		System.out.println("---------------------------------------------------");
	} // main method ends

} //class ends
