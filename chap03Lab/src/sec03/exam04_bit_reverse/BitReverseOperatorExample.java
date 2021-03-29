package sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		
		int v1 = 10;		// 00000000 00000000 00000000 00001010 = 10
		int v2 = ~v1; 	// 11111111 11111111 11111111 11110101 = -11
		
		System.out.println(v1);
		System.out.println(v2);
		
	}
}
