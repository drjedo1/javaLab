package verify;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;
//		Scanner 클래스는 표준입출력장치(콘솔)에서 입력값을 받아온다.
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt(); // 첫번째 입력값
		n2 = sc.nextInt(); // 둘번째 입력값
		n3 = sc.nextInt(); // 세번째 입력값
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		System.out.println("n3="+n3);
		
		// 아래에 코드를 작성하세요.
		// ?
		max = (n1>n2) && (n1>n3) ? n1 : ((n2>n1) && (n2>n3) ? n2 : n3); // 삼항 연산자로 n1, n2, n3 최대값 구하기.
		min = (n1<n2) && (n1<n3) ? n1 : ((n2<n1) && (n2<n3) ? n2 : n3); // 삼항 연산자로 n1, n2, n3 최소값 구하기.
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		
//		max = (n1>n2) && (n1>n3) ? n1 : (n2>n1) && (n2>n3) ? n2 : n3; // 삼항 연산자로 n1, n2, n3 최대값 구하기.
//		min = !(n1>n2) && !(n1>n3) ? n1 : !(n2>n1) && !(n2>n3) ? n2 : n3; // 삼항 연산자로 n1, n2, n3 최소값 구하기.
//		
//		System.out.println("max="+max);
//		System.out.println("min="+min);
			
	}

}
