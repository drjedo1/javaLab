package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {

	// �ʵ�
	int channel;
	
	// ������
	public DmbCellPhone(String model, String color, int channel) {
		// TODO Auto-generated constructor stub
		this.model = model; // ��ӹ��� �ʵ�
		this.color = color; // ��ӹ��� �ʵ�
		this.channel = channel; // �ڽ��� �ʵ�
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� "+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
		
	}
	
}
