package verify;

// Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
public class Child extends Parent {

	// 문제의 private 변수
	private int studentNo;
	
	// 기본 생성자.
	public Child(String name, int studentNo) {
		super(name); // 부모 생성자 명시 필요
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
