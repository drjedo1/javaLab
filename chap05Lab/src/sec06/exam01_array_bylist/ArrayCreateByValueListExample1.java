package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {83, 90, 87, 13, 33, 13, 343, 31, 33, 13, 114, 33};
//		������ ���� ������ .length�ϸ� �ڵ����� ���� ����.
//		length�� �б� ���� �ʵ�� �� ������ �Ұ����ϴ�.
		
		System.out.println("scores[0]="+scores[0]);
		System.out.println("scores[1]="+scores[1]);
		System.out.println("scores[2]="+scores[2]);
		
		int sum = 0;
		//sum = scores[0] + scores[1] + scores[2];
		//�̷��� �ϸ� �밡��.. �̷��� ���Ѵ�.
		
		
		for(int i=0; i<scores.length; i++) {

//						for(int i=0; i<14; i++) { 
//			 �̷��� ���� i<14�� �������� ū ���� for�� ������ ������
//			 out of bounds exception �߻��Ѵ�.

			sum += scores[i];
			
		}
		System.out.println("����: "+sum);
		
		
		
		
		
		
	}
}
