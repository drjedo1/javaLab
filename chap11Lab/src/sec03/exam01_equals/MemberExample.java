package sec03.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
			// equals �޼ҵ带 ������ �ϰ����� ���ڿ� �񱳸� �ؼ� ���ٰ� �Ѵ�.
		} else { // if ends
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�."); 
			// ������ ���̴�, �� �񱳰� �ƴ϶� �ּ� �񱳱� ������ �ٸ��ٰ� ǥ�õǴ� ���̴�.
			// obj1 != obj2
		} // else ends
			
	} // main method ends 



} // class ends
