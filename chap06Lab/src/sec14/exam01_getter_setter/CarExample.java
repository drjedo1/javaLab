package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(); // �� �ڵ带 �����ϴ°� �߿��ϴ�. myCar��� ������ ����鼭
		// Car Ŭ���� Ÿ�� ������ ������̴�. new Ű���带 ���ؼ� Car() �����ڸ� ���ؼ� ��ü�� �����.
		// ��ü �ȿ� �ʵ尡 �ִ�. speed�� stop�� �ִ�.
		
		myCar.setSpeed(-50);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
	}

}
