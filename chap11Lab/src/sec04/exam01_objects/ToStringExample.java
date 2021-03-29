package sec04.exam01_objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(str1.toString()); // "홍길동"
//		System.out.println(str2.toString()); // NullPointerException 예외 발생 
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
//		Parameters : 
//				o     an object
//				nullDefault     string to return 
//										if the first argument is null.

	}

}
