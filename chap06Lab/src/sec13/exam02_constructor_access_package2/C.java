package sec13.exam02_constructor_access_package2;

import sec13.exam02_constructor_access_package1.A;

public class C {

	A a1 = new A(true);		// 된다. 왜냐? public이기 때문에.
//	A a2 = new A(1);				// 안된다. 왜냐? default 생성자이기 때문에.
//	A a3 = new A("문자열");	// 안된다. private 생성자이기 때문에.
	
}
