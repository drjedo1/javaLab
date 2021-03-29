package sec01.exam01_variable;

// 클래스
public class VariableScopeExample2 
{

	// main() 메소드
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// v1 변수 선언
		int v1 = 15;
		
		if(v1 >10) 
		{
			// v2 변수 선언 -이 구역 내에서 쓰겠다는 뜻.
			int v2;
			v2 = v1 - 10;
			System.out.println(v2); 
		}
		
		// <- v2 cannot be resolved to a variable
		System.out.println(v1);
		// System.out.println(v2);
		// 변수는 선언된 중괄호 내에서만 사용 가능.
	}

}
