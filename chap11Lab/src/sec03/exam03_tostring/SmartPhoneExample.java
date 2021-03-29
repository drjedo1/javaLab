package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		// toString의 결과.
		// toString : 
		// Returns a string representation of the object. 

//		sec03.exam03_tostring.SmartPhone@15db9742
		System.out.println(myPhone);
		
		
		String str1 = new String("홍길동");
		System.out.println(str1.toString());
		// 의미 있게 쓰려면 재정의해서 써야한다는게 이 패키지의 요점.
		
	} // main method ends
} // class ends
