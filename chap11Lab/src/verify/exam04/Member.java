package verify.exam04;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
	this.id = id;
	this.name = name;
	}
	// 작성 위치
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ": " + name;
	}
}

// Member 클래스를 작성하되, Object의 toString() 메소드를 
// 오버라이딩해서 MemberExample 클래스의 실행 결과처럼 
// 나오도록 작성해보세요.