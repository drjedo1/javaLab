package sec06.exam01_inteface_extends;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; // �ڵ�����ȯ
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl; // �ڵ�����ȯ
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl; // �ڵ�����ȯ
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
	}

}
