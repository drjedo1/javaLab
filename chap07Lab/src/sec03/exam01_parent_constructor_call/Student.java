package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {

		// �̰� �������ִ� ����ε�, �۵����ϸ� �����߻�
		// �θ� �����ڰ� ��������� ����Ͽ��� �Ѵ�.
		super(name, ssn);
		
		
		this.studentNo = studentNo;
	}
}
