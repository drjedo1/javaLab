package sec04.exam01_abstract_method_use;

// Audio ����Ŭ����.
public class Audio implements RemoteControl {

	// �ʵ�
	private int volume;
	
	// turnOn() �߻�޼ҵ���  ���� �޼ҵ�
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			// this�� �ڱ� �ڽ�.  ��, Television.
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: "+volume);
		
	}

}
