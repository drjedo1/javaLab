package sec07.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
		
		
	}

}
