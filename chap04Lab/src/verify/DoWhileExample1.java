//		[DoWhileExample1.java]
package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in); // sc�� ��ĳ�� ��ü

//				1~100 ������ ��
				int ran = (int)(Math.random()*100) + 1; //56
				int cnt = 0; // �� ���� ������� Ȯ���ϱ� ���� ���� 
				
//				 sc.nextInt()�� ���� �ܼ�(��ĳ�� ��ü)���� ���� �Է¹޾� �����ϴ� ����
				int inNum =0; 
				
				
				
//				 �ۼ���ġ
				do {
					
					System.out.print(">"); // Ŀ�� ǥ��
					inNum = sc.nextInt(); // inNum �ʱ�ȭ
					System.out.println(inNum); // �Է��� ���� ǥ��
					
					if (ran>inNum) {
						System.out.println("������ ������ �۽��ϴ�.");
					} if (ran<inNum){
						System.out.println("������ ������ Ů�ϴ�.");
					}
					
					++cnt; // ����� ������� ī��Ʈ�ϱ�
				} while(!(ran == inNum));
				//...ran == inNum
				
				System.out.println(cnt+"�� ���� ���ƽ��ϴ�.");
				sc.close();
				
				
				
		
	}
}
