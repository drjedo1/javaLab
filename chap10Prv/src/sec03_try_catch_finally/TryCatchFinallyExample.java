package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			���� �߻� ������ �ڵ�
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
//			 �� �ȿ� ���°� ���� ó�� �ڵ�
			System.out.println();
		} finally { // finally ���� ����
			
		}
		
		
	}

}
