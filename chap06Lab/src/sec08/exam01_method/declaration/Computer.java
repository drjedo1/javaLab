package sec08.exam01_method.declaration;

public class Computer {
//		Ŭ������ �������
//		1. �ʵ� 
//		2. ������ 
//		3. �޼ҵ�
	int sum1( int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		} // for end
		return sum;
	} //sum1 end
	
	
	
	
	int sum2 (int... values) {
		int sum = 0;
		for(int i : values) {
			sum += i;
		} //for end
		return sum; // return �����δ� ����ȵ�. ���� ���� �Ǳ� ������. ��ġ break��ó�� ���������ȴ�.
		
//	 �׷��ϱ� �޼ҵ带 ������ ���� ���������� ������ �Ѵ�. return���� ���� ��ȯ�ϴ� �� �Ӹ��ƴ϶� 
//		���������� ���ҵ� �ִ�.
//		return ���� �ִ�, void�� �ƴ� �޼ҵ�� �ݵ�� return ���� �־�� �Ѵ�.
	} //sum2 end
	
//	 return
	
	
	
	
	
	
	
}
