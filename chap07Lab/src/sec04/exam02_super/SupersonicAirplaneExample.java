package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}

}

//�̷��մϴ�.
//�Ϲݺ����մϴ�.
//�����Ӻ����մϴ�.
//�Ϲݺ����մϴ�.
//�����մϴ�.
