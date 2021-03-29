package sec13.exam03_field_mothod_access_package1;

public class B {
	// 기본 생성자. 클래스 이름과 동일
	public B() {
		A a = new A(); // 객체를 만든다. public이기 때문에 문제없이 동작한다.
		a.field1 = 1;				// public, O
		a.field2 = 1; 				// default, O
//		a.field3 = 1; 				// field3는 private이라서 못쓴다.
		
		a.method1();
		a.method2();
		// a.method3(); private은 같은 클래스에서는 되는데 같은 패키지에서는 안된다.
	}
}
