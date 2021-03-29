package sec08.exam04_overloading;

public class Calculator {

	// 필드
	// 생성자

	// 메소드
	
	//정사각형의 넓이
	
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	//이런게 바로 메소드 오버로딩. areaRectangle. 이름은 같은데 메소드 2가지
	
}
