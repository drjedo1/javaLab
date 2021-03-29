package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVal1 = "신민철";
		String strVal2 = "신민철";
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음.");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다름.");
		}
		
		if(strVal1.equals(strVal2)) {
			
//			new 			
			System.out.println("strVal1과 strVal2는 문자열이 같음.");
		} 
	
//아래코드 설명듣는거 조금 놓쳤음... -> 	
			String strVar3 = new String("신민철");
			String strVar4 = new String("신민철");
			if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
			} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
			}
			if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
			}

		
			
			
			
		
	}
}
