package verify.exam03;

public class Student {
	private String studentNum;
	public Student(String studentNum) {
	this.studentNum = studentNum;
	}
	public String getStudentNum() {
	return studentNum;
	}
	// 작성 위치
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			} // second if ends
		} // first if ends
		return false;
	} // equals() ends
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}
}


//실행 결과
//1번 학생의 총점: 95

//Object의 equals()와 hashCode()를 오버라이딩해서 
//Student의 학번(studentNum)이 같으면 
//동등 객체가 될 수 있도록 해보세요.

//Student 클래스의 필드는 다음과 같습니다. 
//hashCode()의 리턴값은 studentNum 필드값의 
//해시코드를 리턴하도록 하세요.