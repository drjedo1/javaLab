package sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		
		for(int i = 1 ; i <= 50 ; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc(); // Garbage Collector�� ������ �����Ų��.
		}
	}

}
