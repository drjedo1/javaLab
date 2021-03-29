package verify;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, sum=0;
		
		for(a=1; a<=100; a++) {

			if(a % 3 == 0) {
				sum += a;
			}
		} // end of for
		System.out.println(sum);
		
	}//eom
} //eoc
