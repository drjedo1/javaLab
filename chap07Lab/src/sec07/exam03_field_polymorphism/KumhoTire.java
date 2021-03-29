package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire {

	// 필드
	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); //부모생성자를 호출하여 부모객체를 생성한다.
	}

	@Override
	
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotation)+"회");
			return true;
		} else
			System.out.println("***"+location+ "KumhoTire 펑크");
			return false;

		
	}
	

	
}
