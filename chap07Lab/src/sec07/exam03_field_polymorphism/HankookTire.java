package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {

	// �ʵ�
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //�θ�����ڸ� ȣ���Ͽ� �θ�ü�� �����Ѵ�.
	}

	@Override
	
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else
			System.out.println("***"+location+ "Ÿ�̾� ��ũ");
			return false;

		
	}
	

	
}
