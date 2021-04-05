package verify.special.exam;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 0;
		int n1=0, n2=0, n3=0, n4=0, n5=0;
		Scanner sc = new Scanner(System.in);
		
		while(total<100) {
			System.out.print("입력 : ");
			if(total<100) {
				n1 = sc.nextInt(); // 첫번째 입력값
				total += n1;
				System.out.print(", 합 : "+total);
				
				System.out.println();
			} else if(total<100) {
				n2 = sc.nextInt(); // 둘번째 입력값
				total += n2;
				System.out.print(", 합 : "+total);
				System.out.println();
			} else if(total<100) {
				n3 = sc.nextInt(); // 세번째 입력값
				total += n3;
				System.out.print(", 합 : "+total);
				System.out.println();
			} else if(total<100) {
				n4 = sc.nextInt(); // 첫번째 입력값
				total += n4;
				System.out.print(", 합 : "+total);
				System.out.println();
			} else {
				n5 = sc.nextInt(); // 둘번째 입력값
				total += n5;
				System.out.print(", 합 : "+total);
				System.out.println();
			}
			
				
		
		} // while ends
		System.out.print("프로그램 종료!");
		

		
		
		
	}

}

// 수행 예시
// 입력
// 입력
// 입력
// 프로그램 종료!