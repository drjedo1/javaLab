package sec09.exam01_instance_member;

public class Car {

	// �ʵ�
	String model;
	int speed;

	// ������
	
//	�̰��� ��üȭ �ϱ� ���ؼ��� ��ü �ν��Ͻ��� �ʿ��ϴ�.
	Car(String model) {
		this.model = model;
	}
	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed; //this.speed�� �ν��Ͻ�(��ü) �ʵ��̴�.
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�"+this.speed+"km/h)");
		}
	}

	
}


//	Ȯ�ι���
//	1. (3)		O
//	2. (4)		O
//	3. (4)		O ��������
//	4. (3)		O �� �׷��� �ʴ�.
//	5. (2)		X		(1)		�ݵ�� �����Ǿ�� �Ѵ�.
//	6. (4)		O �޼ҵ� �����ε�
//	7. (2)		O ���� Ÿ���� ���谡 ����.