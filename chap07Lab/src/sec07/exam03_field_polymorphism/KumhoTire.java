package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire {

	// �ʵ�
	// ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); //�θ�����ڸ� ȣ���Ͽ� �θ�ü�� �����Ѵ�.
	}

	@Override
	
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire ����: " + (maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else
			System.out.println("***"+location+ "KumhoTire ��ũ");
			return false;

		
	}
	

	
}
