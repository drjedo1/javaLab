package sec10.exam02_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		왜 싱글톤을 만드느냐? 객체를 하나만 만들고 싶기 때문에. 자원을 아끼기 위해서
		
		Singleton obj1 = Singleton.getInstance(); // The constructor Singleton() is not visible 
		Singleton obj2 = Singleton.getInstance(); 
		
		if(obj1==obj2) {
			
		}
		
		
	}

}
