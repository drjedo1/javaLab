package verify.exam04;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("blue", "이파란");
		System.out.println(member);
	}

}

// 실행 결과
// blue: 이파란

// Member 클래스를 작성하되, Object의 toString() 메소드를 
// 오버라이딩해서 MemberExample 클래스의 실행 결과처럼 
// 나오도록 작성해보세요.