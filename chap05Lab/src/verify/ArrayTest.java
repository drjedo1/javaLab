package verify;

import java.util.Scanner;
//Ctrl + Shift + O ������ ���� import ����. �̰� ������ ���� ���ٰ� �Ͻ�.

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min;
		int[] s = new int[5];
		System.out.print("���� 5���� �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		
//		�ۼ� ��ġ
		
//		�ؿ����� �ݺ��� ���°� ����. for��
//		s[0]=sc.nextInt();
//		s[1]=sc.nextInt();
//		s[2]=sc.nextInt();
//		s[3]=sc.nextInt();
//		s[4]=sc.nextInt();


		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
		}
//					for(int i=0; i<6; i++)
//			s[5] = sc.nextInt()�� �Ǿ ArrayIndexOutOfBoundException
			
			
		max=s[0];
		min=s[0];
		
//		int  num = sc.nextInt(); 
//		for(int i=0; i<s.length; i++) {
//			s[s.length] = num;
//		}

		//�Ʒ� ���� ���� Ǯ�� ���������, 
		//���� �ȵ̴µ� ���ڱ� ���ص�
		// for�� �����ٺ��� max���� �ᱹ ���� ū ������ ���Ե�.
		//�ֳ��ϸ� Ŀ������ max�� �������� �� ����.
		//�������� ����ϰ� ū���� ���� ���� ��ü��.
		for(int i=1; i<s.length; i++) {
			if(max<s[i]) {
				max=s[i];
			}
//				�� �߰�ȣ ��� �ǳ���.. �ּڰ��� �߰�ȣ ���� ����.
			if (min>s[i]) min=s[i];
		}
		//for�� ���ؼ� �迭�� �����ϸ� ������ ����.
		//������ �پ��� 

		
//				--------------------------------------	
//		 		�Ʒ����� �Ϸ��ٰ� ������ �ڵ�
//				for(int i=0; i<s.length; i++) {
//			if(s[i]>) {}
//				
//				double avg = (double) sum / scores.length;
//			System.out.println("���="+avg);
//				--------------------------------------

		System.out.println("max=" + max);
		System.out.println("min=" + min);

}
}//

//Ű���带 �̿��ؼ� ���� 5���� �Է� ������ 
//int�� �迭�� �����Ѵ�. 
//�̶� �迭�� ����� ���߿��� 
//�ִ밪�� �ּҰ��� ���ϴ� ���α׷��� �ۼ��϶�.