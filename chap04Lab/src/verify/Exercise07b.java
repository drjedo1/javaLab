package verify;

import java.util.Scanner;

public class Exercise07b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int balance = 0;
		Scanner  scanner = new Scanner(System.in);
		
		
//		boolean run = true;
//		int balance = 0;
//		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			// 작성 위치
			int menuNum = scanner.nextInt();

		switch (menuNum) {
		case 1:
			System.out.print("잔고>");
			System.out.println(balance);
			System.out.print("예금액>");
			
			balance += scanner.nextInt();
			
			break;
		case 2:
			System.out.print("잔고>");
			System.out.println(balance);
			System.out.print("출금액>");
			if(balance<=0) {
				System.out.println("잔액이 부족하여 출금할 수 없습니다.");
				continue;
			}

			
			balance -= scanner.nextInt();
			break;
		case 3:
			System.out.print("잔고>");
			System.out.println(balance);
			break;
		case 4:
			run = false;
			break;
		default:
			System.out.println("올바른 번호가 아닙니다... 1~4 사이의 번호를 입력 해주세요.");
			break;
		}
		
		}
		
		System.out.println("프로그램 종료");
	}

}
