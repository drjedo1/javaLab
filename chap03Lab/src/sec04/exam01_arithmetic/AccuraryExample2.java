package sec04.exam01_arithmetic;

public class AccuraryExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int apple = 1; int totalPieces = apple * 10; int number = 7;
		 * 
		 * int temp = totalPieces - number; // 3
		 * 
		 * double result = temp / 10.0;
		 * 
		 * System.out.println(result);
		 */		
		
		int apple = 1;
//		double pieceUnit = 0.1;
//		int pieceUnit = 0.1;
		int pieceUnit = 1; 
		// 1/10 0.0 �� ���� ����. ���� ������ �����̱� ������.
		// �ٵ� ������ �ᵵ ��� ���� ó��ó�� 0.29999999999999993 ����.
		// �ᱹ int ��ߵ�.
		
		
		int number = 7;
		
		double result = (apple * 10 - number * pieceUnit)/10.0;
//		1 - 7 * 0.1 = 1 - 0.7 = 0.3
		
//		(1*10 - 7*1)/10.0 = 0.3 
		System.out.println(result); 
		
		// 0.29999999999999993
		// ������ pieceUnit�� 0.1�� 0.1�� �ƴ϶� �ٻ簪�Դϴ�.
		
		// ����� ��Ȯ�� ����� ���ؼ��� �߰� ��� ���� �Ҽ��� ������ �ȵǰ�
		// ������ ��� ��ġ�� ���� �������� �������� ��Ȯ�� 0.3 �� �Ҽ����� �� ����.
		
		System.out.println(pieceUnit);
		
		
		// -------------------------------------
		
		/*
		 * //double x = 5 / 0; // ���� �߻� double y = 5 / 0.0; //Infinity double z = 5 %
		 * 0.0; //NaN Double.isInfinite(y); //true Double.isNaN(z); //true
		 * 
		 * System.out.println("________________"); //System.out.println(x);
		 * System.out.println(y); System.out.println(z);
		 * System.out.println(Double.isInfinite(y));
		 * System.out.println(Double.isNaN(z));
		 */
	}

}