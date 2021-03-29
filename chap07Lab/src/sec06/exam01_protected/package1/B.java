package sec06.exam01_protected.package1;

public class B {
	public void method() {
		
//		 A 생성자에 protected 접근 제한자가 붙었지만, 
//		 같은 패키지라서 A의 생성자를 호출할 수 있었다.
		A a = new A(); 
		
		a.field = "value";
		a.method();
		
		
		
	}
}// class ends
