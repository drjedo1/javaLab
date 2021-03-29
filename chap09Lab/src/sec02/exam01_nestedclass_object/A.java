package sec02.exam01_nestedclass_object;

// �ٱ� Ŭ����
public class A {
	A() {
		System.out.println("A ��ü�� ������");
	} // A() ends

//	�ν��Ͻ� ��� Ŭ����
	public class B {
		B() {
			System.out.println("B ��ü�� ������");
		} // B() ends
		int field1;

//				�� �޸𸮿� �ֱ� ������ �ν��Ͻ� ��� Ŭ���� �ȿ��� ���� �ʵ� ��� �Ұ�
//				static int field2;
//		The field field2 cannot be declared static in a non-static inner type, 
//		unless initialized with a constant expression
		void method1() {
//			static void method2() {} // �����޼ҵ� ��� �Ұ�
		} //method1 ends

	} //class B ends
	
	static class C {
		C() {
			System.out.println("C ��ü�� ������");
		} // C() ends
		
		//���� ������ ������ �ȿ� ���� �ʵ��� ����!
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	} // class C ends
	void method() {
		// ���� Ŭ����
		class D {
			D() {
				System.out.println("D��ü�� ������");
			} // D() ends
			int field1;
			
			
//			static int fields;
//			The field fields cannot be declared static in a non-static inner type, 
//			unless initialized with a constant expression
			
			void method1() {}

//			void is an invalid type for the variable method2
//			static void method2() {}
			
		}
			D d = new D();
			d.field1 = 3;
			d.method1();
		
	} // method() ends
	
} // class A ends
