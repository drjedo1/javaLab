package sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int charCode = 'b'; // 65
		
		if ((charCode>=65) & (charCode<=90)) {
//			T & T = T
			System.out.println("대문자 이군요");
		}

		if ((charCode>=97) && (charCode<=122)) {
//			F && T = F
			System.out.println("소문자 이군요");
			
//			&&두개는 앞에꺼 false 나오면 뒤에꺼 확인도 안하고 false
//			&한개는 앞에꺼 false라도 뒤에꺼 확인함
//			그러므로 &&가 비교적 빠름
//			& 하나와 두개의 차이.
			
			int value = 9;
			
			/*
			 * if ((value%2==0) || (value%3==0)) { //논리합(||)
			 * 
			 * System.out.println("2 또는 3의 배수 이군요");
			 * 
			 * }
			 */
				if (value%2==0) {
					System.out.println("2의 배수 이군요");
				}
				if (value%3==0) {
					System.out.println("3의 배수 이군요");
				}
			
			
			
		}
		
	}

}
