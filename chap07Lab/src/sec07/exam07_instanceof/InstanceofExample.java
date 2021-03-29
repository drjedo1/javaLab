package sec07.exam07_instanceof;

//import sec07.exam02_promotion_access.Child;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public static void method1(Parent parent) {
			if(parent instanceof Child) {
				Child child = (Child) parent;
				System.out.println("method1-Child로 변환 성공");
			} else {
				System.out.println("method1-Child로 변환하지 않음");
			}
			
			
			public static void method2(Parent parent) {
				Child child = (Child) parent;
				System.out.println("method2-Child로 변환 성공");
			}
			
		} //method1 ends
		Parent parentA = new Child(); // 자동형 변환, 부모형<-자식형
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
		
		
	} // main ends

} //class ends
