package sec03.exam04_break;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		!!!���� ���ѹݺ�����
		while(true) { 
			
//			1~6 ������ ������ ���� �����Ѵ�.
			int num = (int)(Math.random()*6) + 1;
			
			System.out.println(num);
			if(num==6) {
				break;
			}
			
		}
//		System.out.println("���α׷� ����");
		
		
		
	}
}
