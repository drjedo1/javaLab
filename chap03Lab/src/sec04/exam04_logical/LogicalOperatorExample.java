package sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int charCode = 'b'; // 65
		
		if ((charCode>=65) & (charCode<=90)) {
//			T & T = T
			System.out.println("�빮�� �̱���");
		}

		if ((charCode>=97) && (charCode<=122)) {
//			F && T = F
			System.out.println("�ҹ��� �̱���");
			
//			&&�ΰ��� �տ��� false ������ �ڿ��� Ȯ�ε� ���ϰ� false
//			&�Ѱ��� �տ��� false�� �ڿ��� Ȯ����
//			�׷��Ƿ� &&�� ���� ����
//			& �ϳ��� �ΰ��� ����.
			
			int value = 9;
			
			/*
			 * if ((value%2==0) || (value%3==0)) { //����(||)
			 * 
			 * System.out.println("2 �Ǵ� 3�� ��� �̱���");
			 * 
			 * }
			 */
				if (value%2==0) {
					System.out.println("2�� ��� �̱���");
				}
				if (value%3==0) {
					System.out.println("3�� ��� �̱���");
				}
			
			
			
		}
		
	}

}
