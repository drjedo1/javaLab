package sec06.exam01_protected.package1;

public class B {
	public void method() {
		
//		 A �����ڿ� protected ���� �����ڰ� �پ�����, 
//		 ���� ��Ű���� A�� �����ڸ� ȣ���� �� �־���.
		A a = new A(); 
		
		a.field = "value";
		a.method();
		
		
		
	}
}// class ends
