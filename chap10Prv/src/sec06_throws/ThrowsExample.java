package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
			findClass2();
		} catch(ClassNotFoundException e ) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
		
	}
	
	// ���� ���ѱ��
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
				
	}
	
	public static void findClass2() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
				
	}

}
