package verify.special.exam;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 0;
		int n1=0, n2=0, n3=0, n4=0, n5=0;
		Scanner sc = new Scanner(System.in);
		
		while(total<100) {
			System.out.print("�Է� : ");
			if(total<100) {
				n1 = sc.nextInt(); // ù��° �Է°�
				total += n1;
				System.out.print(", �� : "+total);
				
				System.out.println();
			} else if(total<100) {
				n2 = sc.nextInt(); // �ѹ�° �Է°�
				total += n2;
				System.out.print(", �� : "+total);
				System.out.println();
			} else if(total<100) {
				n3 = sc.nextInt(); // ����° �Է°�
				total += n3;
				System.out.print(", �� : "+total);
				System.out.println();
			} else if(total<100) {
				n4 = sc.nextInt(); // ù��° �Է°�
				total += n4;
				System.out.print(", �� : "+total);
				System.out.println();
			} else {
				n5 = sc.nextInt(); // �ѹ�° �Է°�
				total += n5;
				System.out.print(", �� : "+total);
				System.out.println();
			}
			
				
		
		} // while ends
		System.out.print("���α׷� ����!");
		

		
		
		
	}

}

// ���� ����
// �Է�
// �Է�
// �Է�
// ���α׷� ����!