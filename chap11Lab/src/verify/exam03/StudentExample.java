package verify.exam03;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		//new Student("1")의 점수 95를 저장
//		HashMap<Key, Value>
		hashMap.put(new Student("1"), "95");
		//new Student("1") 로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
		
	}

}

//실행 결과
//1번 학생의 총점: 95

// Object의 equals()와 hashCode()를 오버라이딩해서 
// Student의 학번(studentNum)이 같으면 
// 동등 객체가 될 수 있도록 해보세요.

// Student 클래스의 필드는 다음과 같습니다. 
// hashCode()의 리턴값은 studentNum 필드값의 
// 해시코드를 리턴하도록 하세요.