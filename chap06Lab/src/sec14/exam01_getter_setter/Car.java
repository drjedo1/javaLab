package sec14.exam01_getter_setter;



public class Car {

	//�ʵ�
	private int speed;
	private boolean stop;
		
	 //class car end
	
	//������
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		} else { //if end
			this.speed = speed;
		} // else end
		// �̷��� �����ϴ� getter setter�� ������ ���� �ʴٸ� �ӵ��� ���̳ʽ� ���� �ִ� ���� ������ �߻��� �� �ִ�.
	} //setSpeed end	
		
		public boolean isStop() {
			return stop;
		} // isStop end
		public void setStop(boolean stop) {
			this.stop = stop;
			this.speed = 0;
		} // setStop end
		
		
	
	
	
} //getSpeed end
