package sec04.exam01_objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(str1.toString()); // "ȫ�浿"
//		System.out.println(str2.toString()); // NullPointerException ���� �߻� 
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));
//		Parameters : 
//				o     an object
//				nullDefault     string to return 
//										if the first argument is null.

	}

}
