package verify;

import java.util.Scanner;

//import org.apache.commons.lang3.StringUtils;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean run = true;
			
			int balance = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			while (run) {
				System.out.println("-------------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-------------------------------------");
				System.out.print("선택> ");
				// 작성 위치
				
				
				int menunum = scanner.nextInt(); // 숫자 받는 기능
				
				int money = 0;
				
				switch(menunum) {
					case 1: // 예금 기능
						System.out.print("예금액> ");
						money = scanner.nextInt();
						balance += money;
						break;
					case 2: // 출금 기능
						System.out.print("출금액> ");
						money = scanner.nextInt();
						balance -= money;
						break;
					case 3: // 잔고 확인 기능
						System.out.println("잔고> " + balance);
						break;
					case 4: // 프로그램 종료 
						run = false;
						break;
					default: //잘못된 번호 입력했을 때
						
				} //end of switch
				
			} //end of while

			System.out.println("프로그램 종료");
			
	}//eom
}//eoc

//실행 결과
//--------------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료
//--------------------------------------
//선택> 1
//예금액> 10000
//
//--------------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료
//--------------------------------------
//선택> 2
//출금액> 2000
//
//--------------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료
//--------------------------------------
//선택> 3
//잔고> 8000
//
//--------------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료
//--------------------------------------
//선택 4
//
//프로그램 종료
