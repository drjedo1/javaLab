package sec10.exam02_singleton;

public class Singleton {
	// �ʵ�
	// 2. �ڱ� �ڽ� Ÿ���� �ʵ忡 ��ü�� �����Ͽ� ���Խ�Ű�� private static(���� Ŭ������������ ����)���� �����Ѵ�.
	private static Singleton singleton = new Singleton();
	
//	 ������
//	 private ���� �����ڷν� ���� Ŭ���������� ������ ����Ѵ�.
//	 1. �����ڸ� private ���� �����ڷ� �����Ͽ� �ܺ� Ŭ�������� ��ü�� ������ ���ϵ��� �Ѵ�.
	private Singleton() {
		
	}
	
//	 �޼ҵ�
//	 3. ���� Ÿ���� �ڽ� Ÿ������ �� getInstance �޼ҵ带 �����Ͽ� 
//	�ڱ� ������ ��ü�� �Ҵ�� �ʵ带 ��ȯ�ϵ��� �Ѵ�.
	static Singleton getInstance() {
		return singleton;
	}
	
	
}
