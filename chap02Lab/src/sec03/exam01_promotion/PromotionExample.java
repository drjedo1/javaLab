package sec03.exam01_promotion;

//		promotion�� �ڵ� Ÿ�� ��ȯ�� ���� ǥ��
public class PromotionExample {
	public	static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // �ڵ� Ÿ�� ��ȯ : int(4byte) <- byte(1byte) 
		
		System.out.println(intValue); 
		// ū ������ ���� �����͸� �־��⿡ ���� ����.
		
		char charValue = '��';
		intValue = charValue; // �ڵ� Ÿ�� ��ȯ : int(4byte) <- char(2byte)
		System.out.println("���� �����ڵ�=" + intValue); // 44032
		
		intValue = 500;
		long longValue = intValue; // �ڵ�Ÿ�� ��ȯ : long(8byte) <- int (4byte)
		System.out.println(longValue); // 500
		
		double doubleValue = intValue; // �ڵ� Ÿ�� ��ȯ : 
//												double(8 bytes) <- int (4byte)
		System.out.println(doubleValue); // 500.0
		
		//����Ÿ�Ժ�ȯ�� ����� casting
		
		
	}
}
