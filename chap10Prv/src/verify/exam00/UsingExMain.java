package verify.exam00;

public class UsingExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingEx exe=new UsingEx();
		//System.out.println(exe.adds(5,0));
		//System.out.println(exe.sub(5,6));//unreported exception;must be caught
		try{
			System.out.println(exe.sub(5,2));
			System.out.println(exe.subs(5,3));
			System.out.println(exe.sub(5,0));
			}catch(MyZeroException ee){
			System.out.println(ee);
			}
	}

}

//		2
//		1
//		verify.exam00.MyZeroException: 0으로 나누지 마라

//public void method1() throws NumberFormatException, ClassNotFoundException { ... }