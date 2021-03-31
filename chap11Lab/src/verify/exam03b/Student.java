package verify.exam03b;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		public boolean equals(Object obj) {
			Student student = (Student) obj;
			if (obj instanceof Student) {
				Student student = (Student) obj; // 강제형 변환,Student <- Object
				if (studentNum.equals(student.getStudentNum())) {
					return true;
				}
			}
			return false;
		}
	}
}
