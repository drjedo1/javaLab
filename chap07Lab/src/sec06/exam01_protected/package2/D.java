package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A {
	public void method() {
		//super();
		this.field = "value";
		this.method();
		
//		 ���������� protected�� ���� A Ŭ����.
//		�ڽ�Ŭ������ A Ŭ�������� ��Ӱ��踦 ���ؼ� ȣ���� �� �־���.
//		��Ӱ������ C Ŭ���������� ȣ���� �ȉ�� ���̴�.
		
	}
}
