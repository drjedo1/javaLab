package sec10.exam01_static_member;

public class Calculator {

	// ���� �ʵ�, Method ������ ����(����), �޸𸮿��� ��������� �ʴ´ٴ� ���̴�.
	static double pi = 3.14159; 
	
	static int plus(int x, int y) { // ���� �޼ҵ�
		return x+y;
	}
	
	int minus(int x, int y) { // �ν��Ͻ� �޼ҵ�, Heap ������ ����
		return x-y;
	}
	
}
