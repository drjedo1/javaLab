package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {

	// 필드
	int channel;
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		// TODO Auto-generated constructor stub
		this.model = model; // 상속받은 필드
		this.color = color; // 상속받은 필드
		this.channel = channel; // 자신의 필드
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
		
	}
	
}
