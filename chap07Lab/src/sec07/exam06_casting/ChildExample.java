package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Parent parent = new Child(); // �ڵ�����ȯ, �θ��� <- �ڽ���

			parent.field1 = "data1";
			parent.method1();
			parent.method1();
			
			
//			 child�� ���� ������ �ִ� field2

//			���������� ���
//			parent.field2;
//			parent.method3();
			
//			��������ȯ�� �������� : ���� �ڵ�����ȯ(�θ�<-�ڽ�)�� �θ���"��"�� �ڽ������� ��ȯ�� �� �ִ�.
			Child child = (Child) parent; // ��������ȯ, �ڽ��� <- �θ���, 
//			���������� Ȯ��
			child.field2="yyy";
			child.method3();
//			 ���� ����ȯ ��, ������ �ȵǴ� �ڵ尡 �۵��Ǳ� �����ߴ�.
			
			// ���࿡�� : Parent cannot be cast to Child
			Parent p2 = new Parent();
			p2.method1();
			
			
	}

}
