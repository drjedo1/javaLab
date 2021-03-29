package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cannot instantiate the type Phone
		// 폰 타입은 객체화, 인스턴스화 할 수 없다.
//		Phone phone = new Phone("홍길동");
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
	}

}
