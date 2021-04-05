package verify.special.exam;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int total = 0;
		double avg = 0;
		
		for(num=1; num<=100; num++) {
			total = total + num;
		}
		
		avg = (double) total / (double) --num;
		
		
	System.out.println("1~100 ÇÕ°è: "+total);
	System.out.println("Æò±Õ: "+ String.format("%.2f", avg));
	
	}

}
