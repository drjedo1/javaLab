package sec05.exam01_anonymous_extends;

public class Anonymous {
	//필드 초기값으로 익명 자식 객체를 대입

	// 중괄호 없이는 Person의 객체. 중괄호 추가부터는 익명 자식 객체를 중괄호 안에 넣는다.
	
	//필드의 초기값으로 익명 자식 객체를 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	}; 
	void method1() {
		//로컬 변수값으로 익명 자식 객체를 대입.
		Person localVal = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		}; // Person() ends
		// 로컬변수 사용
		localVal.wake();
	} // method1() ends
	void method2(Person person) {
		person.wake();
	}
} // cls Anon ends
