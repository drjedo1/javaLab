package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Parent parent = new Child(); // 자동형변환, 부모형 <- 자식형

			parent.field1 = "data1";
			parent.method1();
			parent.method1();
			
			
//			 child가 원래 가지고 있는 field2

//			참조영역의 축소
//			parent.field2;
//			parent.method3();
			
//			강제형변환의 전제조건 : 원래 자동형변환(부모<-자식)된 부모형"만"이 자식형으로 변환될 수 있다.
			Child child = (Child) parent; // 강제형변환, 자식형 <- 부모형, 
//			참조영역의 확대
			child.field2="yyy";
			child.method3();
//			 강제 형변환 후, 위에서 안되던 코드가 작동되기 시작했다.
			
			// 실행에러 : Parent cannot be cast to Child
			Parent p2 = new Parent();
			p2.method1();
			
			
	}

}
