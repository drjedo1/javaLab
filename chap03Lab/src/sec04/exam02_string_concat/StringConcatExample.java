package sec04.exam02_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String Å¬·¡½º Å¸ÀÔ		
		String str1 = "JDK" + 6.0; // "JDK6.0"
		System.out.println(str1);
		
		String str2 = "JDK" + 3 + 3.0; // "JDK6.0" (x), JDK33.0
		// °ýÈ£·Î ¹­À¸¸é ÇØ°áµÊ. -> "JDK6.0"
		System.out.println(str2);
		
		String str3 = 3 + 3.0 + "JDK"; // "33.0JDK" (x), 6.0+"JDK" = "6.0JDK"
		System.out.println(str3);
		
		String str4 = "JDK" + (3 + 3.0); // "JDK6.0"
		System.out.println(str4);
		
	} // EOM

} //EOC
