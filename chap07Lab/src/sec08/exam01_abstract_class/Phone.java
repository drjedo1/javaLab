package sec08.exam01_abstract_class;

public abstract class Phone {

	// �߻� Ŭ������ ���� ���
	// 1. �ʵ�
	public String owner;
	
//	 2. ������
	public Phone(String owner) {
		this.owner = owner;
	}
	// 3. �߻�޼ҵ� : ���๮�� ����. �׷��� ��۹޴� �ڽ� Ŭ�������� �� �������ؾ� �Ѵ�.

	// ��������. �������̽������� ��������.
	// �߻� �޼ҵ�� ���� ������ ����.
	public abstract void turnOff();
	
	// 4. �Ϲݸ޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
}
