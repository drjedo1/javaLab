package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DmbCellPhone ��ü ����
		// �Ű����� : String model, String color, int channel
		
		// ���� ���� dmbCellPhone ��ſ� dCP ����Ͽ���.
		DmbCellPhone dCP = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("��: "+dCP.model);
		System.out.println("����: "+dCP.color);
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+dCP.channel);
		
		// CellPhone���κ��� ��ӹ��� 
		dCP.powerOn();
		dCP.bell();
		dCP.sendVoice("��������");
		dCP.receiveVoice("�ȳ��ϼ���!");
		dCP.sendVoice("���� ��ħ�Դϴ�.");
		dCP.hangUp();
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dCP.turnOnDmb();
		dCP.changeChannelDmb(11);
		dCP.turnOffDmb();
		
	}

}
