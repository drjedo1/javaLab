package sec02.exam04_default_method;

public interface RemoteControl {

// ���
	
	// �߻�޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ�޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	
	// �����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}
