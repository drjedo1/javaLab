package sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] strArray = new String[3];
	strArray[0] = "Java";
	strArray[1] = "Java";
	strArray[2] = new String("Java");
	
	System.out.println(strArray[0]==strArray[1]); // �� ��ü�� ������ �ִ� �迭�̶� true
	System.out.println(strArray[0]==strArray[2]); // [2]�� �ּҸ� ������ �ִ� ���̱� ������ ���� ���ٰ� �� �� ����.
	System.out.println(strArray[0].equals(strArray[2])); // ���� �����ִ� �ʵ带 �̿��ϸ� ���� ���� �� �񱳸� �� �� �ִ�.
	
	
	
	
	
	}
}
