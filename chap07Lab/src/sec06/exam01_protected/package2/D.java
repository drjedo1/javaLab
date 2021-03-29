package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A {
	public void method() {
		//super();
		this.field = "value";
		this.method();
		
//		 접근제한자 protected를 가진 A 클래스.
//		자식클래스라서 A 클래스에서 상속관계를 통해서 호출할 수 있었다.
//		상속관계없는 C 클래스에서는 호출이 안됬던 것이다.
		
	}
}
