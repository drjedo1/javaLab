package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[~128~127 초과 값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: "+(obj1==obj2)); // false
		// 값은 같지만 주소가 다르기 때문에 false 
		
		
		System.out.println(   "언박싱후==결과: "+(obj1.intValue() == obj2.intValue() )   ); // true
		System.out.println(   "equals() 결과: "+obj1.equals(obj2)   ); // true
		System.out.println();
		
		
		System.out.println("[~128~127 범 값일 경우]");
		Integer obj3 = 30;
		Integer obj4 = 30;
		System.out.println("==결과: "+(obj3==obj4)); // false
		// 값은 같지만 주소가 다르기 때문에 false 
		
		
		System.out.println(   "언박싱후==결과: "+(obj3.intValue() == obj4.intValue() )   ); // true
		System.out.println(   "equals() 결과: "+obj3.equals(obj4)   ); // true
		System.out.println();
		

	}

}
