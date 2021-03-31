package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		
		// 기본 타입값 검
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾는 인덱스: "+index);
		
		
		
		// 문자열 검색
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		int index2 = Arrays.binarySearch(names, "김민수");
		System.out.println("찾는 인덱스: "+index2);
	}
}
