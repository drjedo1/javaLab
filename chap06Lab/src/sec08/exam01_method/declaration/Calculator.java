package sec08.exam01_method.declaration;

public class Calculator {
//		Ŭ������ ���� ��� 
//		1. �ʵ�
//		2. ������
	
	
	
	
//		�⺻ ������
	Calculator() {
		
	}
	
	
	
//		3. �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	
}
