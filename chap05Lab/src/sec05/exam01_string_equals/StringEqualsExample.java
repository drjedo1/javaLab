package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVal1 = "�Ź�ö";
		String strVal2 = "�Ź�ö";
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1�� strVal2�� ������ ����.");
		} else {
			System.out.println("strVal1�� strVal2�� ������ �ٸ�.");
		}
		
		if(strVal1.equals(strVal2)) {
			
//			new 			
			System.out.println("strVal1�� strVal2�� ���ڿ��� ����.");
		} 
	
//�Ʒ��ڵ� �����°� ���� ������... -> 	
			String strVar3 = new String("�Ź�ö");
			String strVar4 = new String("�Ź�ö");
			if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
			} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
			}
			if (strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
			}

		
			
			
			
		
	}
}
