package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'B';
		
//		switch(grade) {
//		case 'A':
//		case 'a':
//			System.out.println("��� ȸ���Դϴ�.");
//			break;
//		case 'B':
//		case 'b':
//			System.out.println("�Ϲ� ȸ���Դϴ�.");
//			break;
//		default:
//			System.out.println("�մ��Դϴ�.");
//		}
		
		if (grade == 'A' || grade == 'a') {
			System.out.println("��� ȸ���Դϴ�.");
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("�Ϲ� ȸ���Դϴ�.");
		} else {
			System.out.println("�մ��Դϴ�.");
		}
	}

}
