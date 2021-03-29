package sec03.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
			// equals 메소드를 재정의 하고나서는 문자열 비교를 해서 같다고 한다.
		} else { // if ends
			System.out.println("obj1과 obj2는 동등하지 않습니다."); 
			// 재정의 없이는, 값 비교가 아니라 주소 비교기 때문에 다르다고 표시되는 것이다.
			// obj1 != obj2
		} // else ends
			
	} // main method ends 



} // class ends
