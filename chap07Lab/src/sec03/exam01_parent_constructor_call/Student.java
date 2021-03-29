package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {

		// 이게 숨겨져있는 기능인데, 작동안하면 오류발생
		// 부모 생성자가 명시적으로 기술하여야 한다.
		super(name, ssn);
		
		
		this.studentNo = studentNo;
	}
}
