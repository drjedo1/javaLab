package sec04.exam01_objects;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer o1 = 1000;
		Integer o2 = 1000; 
		// 힙 메모리의 객체 주소값.
		// 만약 int로 쓰면 값
		
		// Objects.equals() 
//		는 동등 비교. 주소 값이 아니라 객체의 값을 비교하는 것이다.
		System.out.println(Objects.equals(o1, o2)); // true
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2)); // false
		//참조 변수 객체의 값 까지만 비교하는 것이라서 false.
		
		System.out.println(Objects.deepEquals(arr1, arr2)); // true
		// 한단계 더 나아가서 참조 변수 안의 배열 안의 객체의 값까지 비교하는 것이라서 된다.
	}
}
