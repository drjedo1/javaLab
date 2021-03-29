package sec30.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++) {
			
			//짝수만 출력한다.
			if(i%2 !=0) { 
				continue;
			}
			System.out.println(i); //짝수만 출력한다.
		}
	
		
		
		
		
	}
}
