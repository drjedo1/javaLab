package sec08.exam03_method_Call;

public class Calculator {
//			�ʵ�
	//		������
	//		�޼ҵ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y); //���� �޼ҵ� ȣ��
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); // ���� �޼ҵ� ȣ��
		System.out.println(result);
	}
	
	void println(String message) {
		// Terminates the current line by writing the line separator string.

		System.out.println(message);
	}
	
	
}
