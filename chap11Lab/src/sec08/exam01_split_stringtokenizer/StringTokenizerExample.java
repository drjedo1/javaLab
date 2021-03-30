package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizerExample()text, "/";
		int countTokens = st.countTokens();
		for(int i =  0; i < countTokens;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
				while(st.hasMoreTokens()) {
					String token = st.nextToken()
					System.out.println(token); 
				}
		
	}

}
