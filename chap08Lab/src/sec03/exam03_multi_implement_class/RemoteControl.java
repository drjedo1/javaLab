package sec03.exam03_multi_implement_class;

public interface RemoteControl {

		// ���
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		// �߻� �޼ҵ�
		abstract void turnOn();
		void turnOff();
		void setVolume(int volume);
		
		// ����Ʈ �޼ҵ�
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("���� ó���մϴ�.");
			} else {
				System.out.println("���� �����մϴ�.");
			}
		}
		
		
		
		
	}