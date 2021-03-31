package sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	} // Member() ends
		
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	} // compareTo() ends
		
	
		
} // class ends
	

