package exam02_method;

public class StringTrimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel1 = " 02 ";
		String tel2 = "123   ";
		String tel3 = "      123     ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
