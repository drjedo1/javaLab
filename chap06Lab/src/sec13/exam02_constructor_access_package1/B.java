package sec13.exam02_constructor_access_package1;

public class B {
	public B() {
		A a = new A(true); 			//
		A a2 = new A(1); 				//default 접근제한자는
//		A a3 = new A("문자열"); 	// X 		private이기 때문에 안된다.
		
	}
	
}
