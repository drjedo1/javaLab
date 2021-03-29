package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue = 44032;

		// 만약 (char) 안붙이면
		// Type mismatch: cannot convert from int to char
		// 강제타입변환
		char charValue = (char) intValue;  
		// char(2bytes) <- int(4bytes) 그대로 넣으려고 하면 커버안됨.
		
		System.out.println(charValue); // 가
	}

}
