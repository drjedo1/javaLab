package verify;

import java.util.Scanner;
//Ctrl + Shift + O 누르면 쉽게 import 가능. 이거 앞으로 많이 쓴다고 하심.

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min;
		int[] s = new int[5];
		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
//		작성 위치
		
//		밑에꺼는 반복문 쓰는게 좋다. for문
//		s[0]=sc.nextInt();
//		s[1]=sc.nextInt();
//		s[2]=sc.nextInt();
//		s[3]=sc.nextInt();
//		s[4]=sc.nextInt();


		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
		}
//					for(int i=0; i<6; i++)
//			s[5] = sc.nextInt()가 되어서 ArrayIndexOutOfBoundException
			
			
		max=s[0];
		min=s[0];
		
//		int  num = sc.nextInt(); 
//		for(int i=0; i<s.length; i++) {
//			s[s.length] = num;
//		}

		//아래 식을 문제 풀때 못만들었고, 
		//이해 안됫는데 갑자기 이해됨
		// for문 돌리다보면 max에는 결국 제일 큰 값만이 남게됨.
		//왜냐하면 커야지만 max에 남아있을 수 있음.
		//작은수는 통과하고 큰수는 기존 수를 대체함.
		for(int i=1; i<s.length; i++) {
			if(max<s[i]) {
				max=s[i];
			}
//				꼭 중괄호 없어도 되나봄.. 최솟값은 중괄호 없이 쓰심.
			if (min>s[i]) min=s[i];
		}
		//for문 통해서 배열을 연산하면 장점이 많음.
		//변수도 줄어들고 

		
//				--------------------------------------	
//		 		아래꺼는 하려다고 실패한 코드
//				for(int i=0; i<s.length; i++) {
//			if(s[i]>) {}
//				
//				double avg = (double) sum / scores.length;
//			System.out.println("평균="+avg);
//				--------------------------------------

		System.out.println("max=" + max);
		System.out.println("min=" + min);

}
}//

//키보드를 이용해서 정수 5개를 입력 받은후 
//int형 배열에 저장한다. 
//이때 배열에 저장된 값중에서 
//최대값과 최소값을 구하는 프로그램을 작성하라.