package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue = 44032;

		// ���� (char) �Ⱥ��̸�
		// Type mismatch: cannot convert from int to char
		// ����Ÿ�Ժ�ȯ
		char charValue = (char) intValue;  
		// char(2bytes) <- int(4bytes) �״�� �������� �ϸ� Ŀ���ȵ�.
		
		System.out.println(charValue); // ��
	}

}
