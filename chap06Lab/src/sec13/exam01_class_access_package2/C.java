package sec13.exam01_class_access_package2;

import sec13.exam01_class_access_package1.*;

public class C {
	
//	 "A cannot be resolved to a type" 
//	 이 타입으로 해석이 안된다. 접근이 안된다.
//	 다른 클래스에 있는 필드에 접근하려고 했기 때문이다.
	
//	package import 후 -> "The type A is not visible"
	
//	X, default 접근 제한자는 다른 패키지에서 접근할 수 없다.
//	A a; 
	
	
	
	B b; // O, public 접근 제한자

	
	
	
}
