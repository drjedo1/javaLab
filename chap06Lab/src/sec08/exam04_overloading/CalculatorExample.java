package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalcu = new Calculator();
		// �ҽ� ���� ���ϴϱ� ��ü ������ �ȵǼ� ���� �߻��ߴ�.
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		// ���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("���簢�� ����="+result1);
		System.out.println("���簢�� ����="+result2);
		
		
		
	}

}
