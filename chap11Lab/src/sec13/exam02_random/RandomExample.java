package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;


public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNumber = new int[6];
//		Random random = new Random(5);
		Random random = new Random(5);
		System.out.println("선택 번호: " );
		for(int i = 0 ; i < 6 ; i++) {
			selectNumber[i] = random.nextInt(45) +1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨번호: ");
		for(int i = 0 ; i < 6 ; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
			
		}
		System.out.println();
		System.out.println();
		System.out.println(Arrays.equals(selectNumber, winningNumber));
		
		if(  (Arrays.equals(selectNumber, winningNumber)  ) == true) {
			System.out.println("당첨!");
		} else {
			System.out.println("낙첨...");
		}
		
	}

}
