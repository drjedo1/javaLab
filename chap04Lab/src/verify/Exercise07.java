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
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("-------------------------------------");
				System.out.print("����> ");
				// �ۼ� ��ġ
				
				
				int menunum = scanner.nextInt(); // ���� �޴� ���
				
				int money = 0;
				
				switch(menunum) {
					case 1: // ���� ���
						System.out.print("���ݾ�> ");
						money = scanner.nextInt();
						balance += money;
						break;
					case 2: // ��� ���
						System.out.print("��ݾ�> ");
						money = scanner.nextInt();
						balance -= money;
						break;
					case 3: // �ܰ� Ȯ�� ���
						System.out.println("�ܰ�> " + balance);
						break;
					case 4: // ���α׷� ���� 
						run = false;
						break;
					default: //�߸��� ��ȣ �Է����� ��
						
				} //end of switch
				
			} //end of while

			System.out.println("���α׷� ����");
			
	}//eom
}//eoc

//���� ���
//--------------------------------------
//1.���� | 2.��� | 3.�ܰ� | 4.����
//--------------------------------------
//����> 1
//���ݾ�> 10000
//
//--------------------------------------
//1.���� | 2.��� | 3.�ܰ� | 4.����
//--------------------------------------
//����> 2
//��ݾ�> 2000
//
//--------------------------------------
//1.���� | 2.��� | 3.�ܰ� | 4.����
//--------------------------------------
//����> 3
//�ܰ�> 8000
//
//--------------------------------------
//1.���� | 2.��� | 3.�ܰ� | 4.����
//--------------------------------------
//���� 4
//
//���α׷� ����
