package sec05.exam04_local_variable_access;

public class Anonymous {
	// 필드
	private int field;
	
	// 생성자
	
	// 메소드
	public void method(final int arg1, final int arg2) {
		final int var1 = 0;
		final int var2 = 0; // 로컬변수들은 스택에 저장된다.
		
		field = 10; // 밖에있는 필드
		
//	Local variable arg1 defined in an enclosing scope 
//	must be final or effectively final
//		arg1= 20;
		
		//  힙메모리에 저장되는 공간. ~ return ~ }; 까지
		// 로컬변수 calc에 익명 구현 객체를 대입시킨다.
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				

				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			} // sum() ends
		}; // Calculatable() ends
	} // method() ends
	
} // Anonymous ends
