package sec09.exam01_instance_member;

public class Car {

	// 필드
	String model;
	int speed;

	// 생성자
	
//	이것을 객체화 하기 위해서는 객체 인스턴스가 필요하다.
	Car(String model) {
		this.model = model;
	}
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed; //this.speed은 인스턴스(객체) 필드이다.
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속"+this.speed+"km/h)");
		}
	}

	
}


//	확인문제
//	1. (3)		O
//	2. (4)		O
//	3. (4)		O 생략가능
//	4. (3)		O 꼭 그렇지 않다.
//	5. (2)		X		(1)		반드시 생성되어야 한다.
//	6. (4)		O 메소드 오버로딩
//	7. (2)		O 리턴 타입은 관계가 없다.