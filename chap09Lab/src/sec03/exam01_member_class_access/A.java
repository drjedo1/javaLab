package sec03.exam01_member_class_access;

public class A {
//		�ν��Ͻ� �ʵ�
	
	int[] intArray = new int[3];
	B field1 = new B();
	C field2 = new C();
	
//	�ν��Ͻ� �޼ҵ�
	void method1() {
//		���ú���
		B var1 = new B();
		C var2 = new C();
	}
	
//	���� �޼ҵ�
	static void method2() {

//		�����޼ҵ忡�� �ν��Ͻ� ��� Ŭ������ ����� �� ����.
//		No enclosing instance of type A is accessible. 
//		Must qualify the allocation with an enclosing instance of type A 
//		(e.g. x.new A() where x is an instance of A).
//		B var1 = new B();
		
//		�����޼ҵ忡 ���� ��� Ŭ������ ����� �� �ִ�.
		C var2 = new C();
	}
	
//		�ν��Ͻ� ��� Ŭ����
	class B {
	}
	
	// ���� ��� Ŭ����
	static class C {
	}

}
