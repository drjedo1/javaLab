package sec08.exam02_abstract_method;

public abstract class Animal {

	//�߻�Ŭ������ ���
	//1. �ʵ�
	public String kind;
	
	//2. ������
	//3. �߻�޼ҵ�
	public abstract void sound();
	
	//4. �Ϲݸ޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
		
	}
	
}
