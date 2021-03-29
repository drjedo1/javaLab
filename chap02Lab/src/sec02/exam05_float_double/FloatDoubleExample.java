package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double var1 = 3.14;
		float var2 = 3.14F; // Type mismatch: cannot convert from double to float
		
		float var3 = 3e6F; //
		double var4 = 3e6;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
	}

}
