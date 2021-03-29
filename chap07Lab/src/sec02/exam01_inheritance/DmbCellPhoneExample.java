package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DmbCellPhone 객체 생성
		// 매개변수 : String model, String color, int channel
		
		// 참조 변수 dmbCellPhone 대신에 dCP 사용하였음.
		DmbCellPhone dCP = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone으로부터 상속 받은 필드
		System.out.println("모델: "+dCP.model);
		System.out.println("색상: "+dCP.color);
		
		// DmbCellPhone의 필드
		System.out.println("채널: "+dCP.channel);
		
		// CellPhone으로부터 상속받은 
		dCP.powerOn();
		dCP.bell();
		dCP.sendVoice("여보세요");
		dCP.receiveVoice("안녕하세요!");
		dCP.sendVoice("좋은 아침입니다.");
		dCP.hangUp();
		
		// DmbCellPhone의 메소드 호출
		dCP.turnOnDmb();
		dCP.changeChannelDmb(11);
		dCP.turnOffDmb();
		
	}

}
