package sec03.exam04_break;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		!!!현재 무한반복상태
		while(true) { 
			
//			1~6 사이의 임의의 정수 생성한다.
			int num = (int)(Math.random()*6) + 1;
			
			System.out.println(num);
			if(num==6) {
				break;
			}
			
		}
//		System.out.println("프로그램 종료");
		
		
		
	}
}
