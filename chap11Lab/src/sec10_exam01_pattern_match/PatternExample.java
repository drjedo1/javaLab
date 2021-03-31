package sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //정규식
		// \d 	한 개의 숫자, [0-9]와 동일
		// 앞에 \ 한개 더 넣은 이유는 특수기호 표시하기 위해서. \\d 이렇게 적는다.
		// 예를 들자면 \t 같은 경우는 탭키.
		// {n,m} 이거는 n부터 m까지
		// +는 하나 이상.
		
		
		String data = "010-123-4567"; // 검증 데이터
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
			regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
			// angel@naver.com
			// angel@ddd.co.kr
			data = "angel@naver.com";
			result = Pattern.matches(regExp, data);
			if(result) {
				System.out.println("정규식과 일치합니다.");
			} else {
				System.out.println("정규식과 일치하지 않습니다.");
			}
		}
	}


