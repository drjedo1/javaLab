package sec04.exam01_overriding;

public class Computer extends Calculator {

	// �޼ҵ� ������(Method overriding)
	// ������̼� : �����Ϸ����� �ڵ�(������ ����) ������ ��û�Ѵ�.
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer ��ü�� areaCircle() ����");
//		return super.areaCircle(r);
		return Math.PI * r * r;
	}
	
//	@Override
	double area2Circle(double r) {
		return 1.0;
		
	}

	
	
}
