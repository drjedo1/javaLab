package verify;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		단 title출력
		for (int dan = 2; dan <=9; dan++) {
//			System.out.print(); 메소드는 한줄에 출력한다.
			System.out.print("[" + dan + "단]" + "\t");	
		} System.out.print("\n"); //new line after title
		for (int b = 1; b <= 9; b++) {
			for (int a = 2; a <=9; a++) {
				System.out.print(a + "*" + b + "=" + a*b + "\t");
			}System.out.print("\n"); //end of for a, new line after dan
		} //end of for b

	
	
	
	}//eom
}//eoc
