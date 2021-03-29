package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	
	// 생성자.
	
	// 이게 없으면 이거 만들라고 에러 뜬다.
//	Implicit super constructor Phone() is undefined for default constructor. Must define an explicit constructor
//	1quick fix available:
//	Add constructor 'SmartPhone(String)'

		public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

//	추상메소드를 재정의하여 일반 메소드로 만든다.
//		필수, 이거 빼면 오류뜨면서 컴파일 안된다.
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("폰 전원을 끕니다.");
	}
	
	
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
		
	}
	
}
