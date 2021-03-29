package sec03.exam03_multi_implement_class;

import sec03.exam03_multi_implement_class.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"�� �˻��մϴ�.");

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�.");
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
		System.out.println("���� TV ����: "+volume);
	}

}
