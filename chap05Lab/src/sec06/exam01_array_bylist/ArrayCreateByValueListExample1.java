package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {83, 90, 87, 13, 33, 13, 343, 31, 33, 13, 114, 33};
//		위에꺼 세기 어려우면 .length하면 자동으로 숫자 세줌.
//		length는 읽기 전용 필드라서 값 수정이 불가능하다.
		
		System.out.println("scores[0]="+scores[0]);
		System.out.println("scores[1]="+scores[1]);
		System.out.println("scores[2]="+scores[2]);
		
		int sum = 0;
		//sum = scores[0] + scores[1] + scores[2];
		//이렇게 하면 노가다.. 이런건 안한다.
		
		
		for(int i=0; i<scores.length; i++) {

//						for(int i=0; i<14; i++) { 
//			 이렇게 쓰면 i<14가 범위보다 큰 수를 for문 돌리기 때문에
//			 out of bounds exception 발생한다.

			sum += scores[i];
			
		}
		System.out.println("총합: "+sum);
		
		
		
		
		
		
	}
}
