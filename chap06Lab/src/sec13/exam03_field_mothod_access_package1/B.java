package sec13.exam03_field_mothod_access_package1;

public class B {
	// �⺻ ������. Ŭ���� �̸��� ����
	public B() {
		A a = new A(); // ��ü�� �����. public�̱� ������ �������� �����Ѵ�.
		a.field1 = 1;				// public, O
		a.field2 = 1; 				// default, O
//		a.field3 = 1; 				// field3�� private�̶� ������.
		
		a.method1();
		a.method2();
		// a.method3(); private�� ���� Ŭ���������� �Ǵµ� ���� ��Ű�������� �ȵȴ�.
	}
}
