package verify;

// Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
public class Child extends Parent {

	// ������ private ����
	private int studentNo;
	
	// �⺻ ������.
	public Child(String name, int studentNo) {
		super(name); // �θ� ������ ��� �ʿ�
		this.name = name;
		this.studentNo = studentNo;
//		this.setStudentNo(studentNo); // getter, 
	}

//	public int getStudentNo() {
//		return studentNo;
//	}
//
//	public void setStudentNo(int studentNo) {
//		this.studentNo = studentNo;
//	}
	
}
