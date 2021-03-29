package sec02.exam01_nestedclass_object;

// 바깥 클래스
public class A {
	A() {
		System.out.println("A 객체가 생성됨");
	} // A() ends

//	인스턴스 멤버 클래스
	public class B {
		B() {
			System.out.println("B 객체가 생성됨");
		} // B() ends
		int field1;

//				힙 메모리에 있기 때문에 인스턴스 멤버 클래스 안에서 정적 필드 사용 불가
//				static int field2;
//		The field field2 cannot be declared static in a non-static inner type, 
//		unless initialized with a constant expression
		void method1() {
//			static void method2() {} // 정적메소드 사용 불가
		} //method1 ends

	} //class B ends
	
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		} // C() ends
		
		//밑의 내용을 생성자 안에 넣지 않도록 주의!
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	} // class C ends
	void method() {
		// 로컬 클래스
		class D {
			D() {
				System.out.println("D객체가 생성됨");
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
