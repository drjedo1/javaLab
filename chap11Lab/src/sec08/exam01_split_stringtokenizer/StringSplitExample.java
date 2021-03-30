package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		// 여기도 스페이스 있으면 오류생긴다.
		
		String[] names = text.split("&|,|-");
		// 사이에 스페이스가 없어야된다. 있으면 오류생
		
		for(String name : names) {
			System.out.println(name);
			
		}
	}

}
