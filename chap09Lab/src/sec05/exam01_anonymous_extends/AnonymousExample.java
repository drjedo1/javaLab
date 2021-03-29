package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		// 이 클래스의 객체 만들기
		// 이 클래스 타입의 객체 만들기. 클래스 생성자를 통해서
		Anonymous anony = new Anonymous();
		
		anony.field.wake(); // 필드에 넣은것
		
		anony.method1(); // 로컬 변수에 넣은 것.
		
		// 매개 변수에 익명자식객체를 사용한다.
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("8시에 일어납니다.");
				study();
			}
			
		});
	}

}
