package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tv ������ ���߱�����ü�� �����Ͽ� �����Ѵ�.
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; // RemoteControl �������̽� Ÿ�Կ� �����Ѵ�.
		Searchable searchable = tv; // Searchable �������̽� Ÿ�Կ� ����
	}

}
