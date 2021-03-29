package sec06.exam01_inteface_extends;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; // 자동형변환
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl; // 자동형변환
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl; // 자동형변환
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
	}

}
