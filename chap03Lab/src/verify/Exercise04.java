package verify;

public class Exercise04 {
	public static void main(String[] args) {
		
//		int pencils = 534;
//		int students = 30;
		// �л� �� ���� ������ ���� ��
//		int pencilsPerStudent = ( pencils/students );
//		System.out.println(pencilsPerStudent); // 17
		// ���� ���� ��
//		int pencilsLeft = ( pencils%students );
//		System.out.println(pencilsLeft); // 24
		
//		int value = 356;
//		System.out.println( value-=value%60 ); // 300
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((float) (height*height*lengthBottom+lengthTop*height)/lengthBottom); // 52.5
		System.out.println(area);
	}
}
