package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
		try {
//			 ���ܹ߻� ������ �ڵ� ����
			data1 = args[0];
			data2 = args[1];
			
		} catch(ArrayIndexOutOfBoundsException e) {
//			 ����ó�� �ڵ� ����
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} finally {
//			������ �����ϴ� �ڵ�
			System.out.println("�ٽ� �����ϼ���.");
		}
		
	}

}
