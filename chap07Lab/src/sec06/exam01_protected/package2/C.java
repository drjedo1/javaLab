package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class C {
	public void method() {
		
//		The constructor A() is not visible
//		다른 패키지의 경우부터는 접근 제한자 protected의 영향으로 A 생성자를 호출할 수 없게 된다.
//		A a = new A();
	}
}
