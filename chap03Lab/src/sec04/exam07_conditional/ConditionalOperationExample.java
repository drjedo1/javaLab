package sec04.exam07_conditional;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 70;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C'); // grade = 'B'
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}

}
