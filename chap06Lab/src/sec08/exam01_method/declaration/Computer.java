package sec08.exam01_method.declaration;

public class Computer {
//		클래스의 구성멤버
//		1. 필드 
//		2. 생성자 
//		3. 메소드
	int sum1( int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		} // for end
		return sum;
	} //sum1 end
	
	
	
	
	int sum2 (int... values) {
		int sum = 0;
		for(int i : values) {
			sum += i;
		} //for end
		return sum; // return 밑으로는 실행안됨. 실행 중지 되기 때문에. 마치 break문처럼 실행중지된다.
		
//	 그러니깐 메소드를 나가는 역할 빠져나가는 역할을 한다. return문은 값을 반환하는 것 뿐만아니라 
//		실행중지의 역할도 있다.
//		return 값이 있는, void가 아닌 메소드는 반드시 return 값이 있어야 한다.
	} //sum2 end
	
//	 return
	
	
	
	
	
	
	
}
