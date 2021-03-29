package verify;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		4x + 5y = 60
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
			if ((4 * x + 5 * y)==60) {
				System.out.println("("+x+", "+y+")");
			}
			}
		}
		
	}
} //eoc