//		[DoWhileExample1.java]
package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in); // sc는 스캐너 객체

//				1~100 사이의 수
				int ran = (int)(Math.random()*100) + 1; //56
				int cnt = 0; // 몇 번에 맞췄는지 확인하기 위한 변수 
				
//				 sc.nextInt()를 통해 콘솔(스캐너 객체)에서 값을 입력받아 저장하는 변수
				int inNum =0; 
				
				
				
//				 작성위치
				do {
					
					System.out.print(">"); // 커서 표시
					inNum = sc.nextInt(); // inNum 초기화
					System.out.println(inNum); // 입력한 숫자 표시
					
					if (ran>inNum) {
						System.out.println("지정된 수보다 작습니다.");
					} if (ran<inNum){
						System.out.println("지정된 수보다 큽니다.");
					}
					
					++cnt; // 몇번에 맞췄는지 카운트하기
				} while(!(ran == inNum));
				//...ran == inNum
				
				System.out.println(cnt+"번 만에 맞쳤습니다.");
				sc.close();
				
				
				
		
	}
}
