package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;

//		int y = 0;
//		int z = x / y;
//		java.lang.ArithmeticException: / by zero
		
		double y = 0.0;
		double z = x / y;
		double t = x % y; // ������ ���ϱ� 5 % 0.0 = NaN
		
//		���Ѱ� nan�� �˻��ϴ� ��ƾ
		if(Double.isInfinite(z) || Double.isNaN(t)) {    
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z);
			System.out.println(t);
			
			
		}
		
	}

}
