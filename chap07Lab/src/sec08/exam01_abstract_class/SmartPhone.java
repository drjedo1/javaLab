package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	
	// ������.
	
	// �̰� ������ �̰� ������ ���� ���.
//	Implicit super constructor Phone() is undefined for default constructor. Must define an explicit constructor
//	1quick fix available:
//	Add constructor 'SmartPhone(String)'

		public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

//	�߻�޼ҵ带 �������Ͽ� �Ϲ� �޼ҵ�� �����.
//		�ʼ�, �̰� ���� �����߸鼭 ������ �ȵȴ�.
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("�� ������ ���ϴ�.");
	}
	
	
	
	// �޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
		
	}
	
}
