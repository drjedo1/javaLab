package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car클래스의 Car() Car 객체 생성
		Car myCar = new Car(); //기본 생성자가 만들어져 있기 때문에 new 연산자로 생성할 수 있다.
		
//		 필드 값 읽기
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		
		// 필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
		
		
//		Car 클래스  ─────┐
//		Method						↓
//		Stack						Heap
//	 ───────┬───────
//		┌──┐		│			┌────────┐
//		└──┘		│			│
//		myCar	── │─→  │160
		
		
		
		
		
		
		
		
		
	}

}
