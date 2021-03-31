package verify.exam00;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {
	// 주민번호 타당성 검사하는 메소드
//	배열과 반복문을 쓰는게 좋다.
	public boolean juminCheck(String jumin) {
//	jumin = "8001011234567"
//		jumin = "7810101234567"
//	...
//		작성위치

//		########################################		
//		System.out.println(jumin.substring(i,i+1));
//		System.out.println(mul[i]);
//		System.out.println("*");

//		########################################
//		1. 주민 번호 각 자리에 해당 숫자를 곱한다.

//		예) 8 0 0 1 0 1 - 1 2 3 4 5 6 7
//									  ¯
//									  체크용 번호
//	    ☓ )2 3 4 5 6 7   8 9 2 3 4 5
//		(8*2)+(0*3)+(0*4)+(1*5)+(0*6)+(1*7)+(1*8)+(2*9)+(3*2)+(4*3)+
//		(5*4)+(6*5) = 122

		int[] mul = {2,3,4,5,6,7,8,9,  2,3,4,5};
		int total = 0;
		int total2;
		
		for (int i=0; i<12; i++) {
			total += Integer.parseInt(jumin.substring(i,i+1)) * mul[i];
		} // for ends
//		########################################
//		2. 1번의 연산 결과를 11로 나누어서 나머지를 구한다.

//		122 ／ 11 = 11 ............ 1
//				   (몫) 			   (나머지)
		
		total %= 11; // total = total % 11;
			
//		########################################			
//		3. 11에서 나머지 값을 뺀 후 "체크용 번호"와 비교해서 같으면
//		   올바른 주민번호, 그렇지 않으면 틀린 주민 번호

//			11    -    1    =    10    ≠    7
//					  (연산결과)             (체크용 번호)
//		   만약, 연산결과가 10이상이면, 다시 10으로 나누어서 그 나머지를 체크용 번호와 비교한다.
//				10 / 10 = 1 ......... 0 ≠ 7
//				(몫) (나머지) (체크용 번호)
//				∴ 위 주민번호는 틀린 주민 번호임.
		
		total2 = 11 - total;
		if (total2 >= 10) {
			total2 %= 10; // total2 = total2 % 10; 
		} // if ends
		
		
		// 4. total2와 주민등록번호 마지막 번호와 같은지 비교한다.

			
		
		System.out.println(total);
		System.out.println(jumin.substring(0,1));
//		
		
		if(   total2 != Integer.parseInt(jumin.substring(12,13) )   ) {
			return false;
		} else {
			return true;
		}
		
		
	} // juminCheck() ends
	
//	System.out.println("########");
	
//	System.out.println("########");
	
	

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	JuminCheck01 jc = new JuminCheck01();
	
	
//	InputStream is = System.in;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("주민번호 앞자리를 입력 하세요?");
	String jumin1 = sc.next(); // 800101
	
	System.out.println("주민번호 뒷자리를 입력 하세요?");
	String jumin2 = sc.next(); // 1234567
	
	if (jumin1.length() != 6) {
	System.out.println("주민번호 앞자리는 6자리 입력");
	} else if (jumin2.length() != 7) {
	System.out.println("주민번호 뒷자리는 7자리 입력");
	} else if (!jc.juminCheck(jumin1 + jumin2)) { // 111111111011
	System.out.println("잘못된 주민번호 입니다.");
	} else {
	System.out.println("올바른 주민번호 입니다");
	} // else ends
	} // main ends
	
} // class JuminCheck01 ends 
