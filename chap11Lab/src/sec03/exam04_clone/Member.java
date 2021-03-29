package sec03.exam04_clone;

public class Member implements Cloneable{ 
//	 implements Cloneable 안쓰면 아래 Exception 발생.
//	java.lang.CloneNotSupportedException: sec03.exam04_clone.Member
//	at java.lang.Object.clone(Native Method)
//	at sec03.exam04_clone.Member.getMember(Member.java:21)
//	at sec03.exam04_clone.MemberExample.main(MemberExample.java:10)
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	} // public Member getMember() @@@ends
	
} // public class Member @@@ends
