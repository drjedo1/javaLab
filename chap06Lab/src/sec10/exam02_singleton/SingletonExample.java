package sec10.exam02_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�� �̱����� �������? ��ü�� �ϳ��� ����� �ͱ� ������. �ڿ��� �Ƴ��� ���ؼ�
		
		Singleton obj1 = Singleton.getInstance(); // The constructor Singleton() is not visible 
		Singleton obj2 = Singleton.getInstance(); 
		
		if(obj1==obj2) {
			
		}
		
		
	}

}
