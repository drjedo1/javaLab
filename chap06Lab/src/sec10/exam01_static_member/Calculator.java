package sec10.exam01_static_member;

public class Calculator {

	// 정적 필드, Method 영역에 생성(공유), 메모리에서 사라지지가 않는다는 뜻이다.
	static double pi = 3.14159; 
	
	static int plus(int x, int y) { // 정적 메소드
		return x+y;
	}
	
	int minus(int x, int y) { // 인스턴스 메소드, Heap 영역에 생성
		return x-y;
	}
	
}
