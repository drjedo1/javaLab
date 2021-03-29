package sec03.exam01_promotion;

//		promotion은 자동 타입 변환의 영어 표현
public class PromotionExample {
	public	static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 자동 타입 변환 : int(4byte) <- byte(1byte) 
		
		System.out.println(intValue); 
		// 큰 공간에 작은 데이터를 넣었기에 문제 없다.
		
		char charValue = '가';
		intValue = charValue; // 자동 타입 변환 : int(4byte) <- char(2byte)
		System.out.println("가의 유니코드=" + intValue); // 44032
		
		intValue = 500;
		long longValue = intValue; // 자동타입 변환 : long(8byte) <- int (4byte)
		System.out.println(longValue); // 500
		
		double doubleValue = intValue; // 자동 타입 변환 : 
//												double(8 bytes) <- int (4byte)
		System.out.println(doubleValue); // 500.0
		
		//강제타입변환은 영어로 casting
		
		
	}
}
