package sec07.exam03_field_polymorphism;

public class Tire {

	// �ʵ�
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	} //cnstrctr tire ends

	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else
			System.out.println("***"+location+ "Ÿ�̾� ��ũ");
			return false;
		
	} //roll ends
	} //clss ends
		
	
	