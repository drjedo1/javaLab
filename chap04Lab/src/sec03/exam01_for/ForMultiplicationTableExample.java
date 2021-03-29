package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int dan=2; dan<=9; dan++) {
			System.out.println("*** "+ dan + "´Ü ***");
			for(int n=1; n<=9; n++) {
				System.out.println(dan + "x" + n + "=" + (dan*n));
			}
			
		}
		
	}

}
