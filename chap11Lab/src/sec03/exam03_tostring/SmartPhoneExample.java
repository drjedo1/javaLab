package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		// toString�� ���.
		// toString : 
		// Returns a string representation of the object. 

//		sec03.exam03_tostring.SmartPhone@15db9742
		System.out.println(myPhone);
		
		
		String str1 = new String("ȫ�浿");
		System.out.println(str1.toString());
		// �ǹ� �ְ� ������ �������ؼ� ����Ѵٴ°� �� ��Ű���� ����.
		
	} // main method ends
} // class ends
