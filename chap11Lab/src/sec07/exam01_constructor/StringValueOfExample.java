package sec07.exam01_constructor;

public class StringValueOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = String.valueOf(10); // 10 -> "10"
		String str2 = String.valueOf(10.5); // 10.5 -> "10.5"
		String str3 = String.valueOf(true); // true -> "true"
		// 기본형을 String타입으로 변환시키는 기능.
		// 기본형을 참조형으로 변환시키는 기능.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
