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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			// �ۼ� ��ġ
			int menuNum = scanner.nextInt();

		switch (menuNum) {
		case 1:
			System.out.print("�ܰ�>");
			System.out.println(balance);
			System.out.print("���ݾ�>");
			
			balance += scanner.nextInt();
			
			break;
		case 2:
			System.out.print("�ܰ�>");
			System.out.println(balance);
			System.out.print("��ݾ�>");
			if(balance<=0) {
				System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�.");
				continue;
			}

			
			balance -= scanner.nextInt();
			break;
		case 3:
			System.out.print("�ܰ�>");
			System.out.println(balance);
			break;
		case 4:
			run = false;
			break;
		default:
			System.out.println("�ùٸ� ��ȣ�� �ƴմϴ�... 1~4 ������ ��ȣ�� �Է� ���ּ���.");
			break;
		}
		
		}
		
		System.out.println("���α׷� ����");
	}

}
