package sec03.exam01_equals;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.Exception;


public class Member extends Object { // extends Object 생략되어 있는 것이다.
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	// 값 비교 방법
	// 사실 값이 들어 있는게 아니라 String 객체가 들어 있는 것이다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj; // 강제 타입 변환
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
