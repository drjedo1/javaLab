package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		 Week 열겨형 today 변수에 Week.SUNDAY 상수를 대입한다.
		Week today = Week.SUNDAY;
		
//		Enum.name() : 열거형 상수의 이름을 반환한다.
		String name = today.name();
		System.out.println(name); //"SUNDAY"
		
//		Enum.ordinal(): 열거형 상수의 순서를 반환한다.
		int ordinal = today.ordinal();
		System.out.println(ordinal); //6
		
//		 Enum.compareTo() 메소드
		Week day1 = Week.MONDAY ;
		Week day2 = Week.WEDNESDAY ;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1); // -2
		System.out.println(result2); // 2
	}

}
