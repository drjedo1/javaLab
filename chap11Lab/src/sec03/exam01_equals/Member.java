package sec03.exam01_equals;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.Exception;


public class Member extends Object { // extends Object �����Ǿ� �ִ� ���̴�.
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	// �� �� ���
	// ��� ���� ��� �ִ°� �ƴ϶� String ��ü�� ��� �ִ� ���̴�.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj; // ���� Ÿ�� ��ȯ
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
