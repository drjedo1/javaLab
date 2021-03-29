package verify;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] s = new int[8][9]; // 8행 9열
		
		
		// 구구단 세로로 한줄로 출력
//		for (int dan = 0; dan <= 7; dan++) { // 행
//		System.out.println("[" + (dan + 2) + "단]");
//		for (int i = 0; i <= 8; i++) { // 열
//		s[dan][i] = (dan + 2) * (i + 1);
//		System.out.println((dan + 2) + "*" + (i + 1) + "=" + s[dan][i]);
//		}
//		System.out.println("");
//		}

		
		// 확장 for문을 이용
		System.out.println("*** 향상된 for문을 이용 ***");
		int dan = 2;
		int num;
		for (int i[]: s) {
		System.out.println("[" + dan + "단]");
		num = 1;
		
			for(int j : i) { // 위에서 새로만든 배열 i는 9개짜리 배열이고, j는 가져올 변수 공간만 만든것일 뿐.

				System.out.println(dan+"*"+num+"="+dan*num);
				num++;
			}
//			System.out.println(dan+"*"+num+"="+dan*num);

			System.out.println("");
			dan++;
		}
		
		// 작성 위치
//		for( ) {
		
		
		
	
	
	
	
	
	}
}
