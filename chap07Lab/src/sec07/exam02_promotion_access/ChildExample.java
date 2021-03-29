package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child(); 
		
		child.method1();
		child.method2();
		child.method3();
		
		
		Parent parent = child; // 자동형변환, 부모형 <= 자식형
		
		parent.method1();
		parent.method2();
//		parent.method3(); // X
	}

}
