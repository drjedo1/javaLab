package sec07.exam03_constructor_overloading;

public class Car {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
//	생성자
	Car(){
		
	}

	
//		생성자 오버로딩 (Contstructor Overloading)
	Car(String model){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;

	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
