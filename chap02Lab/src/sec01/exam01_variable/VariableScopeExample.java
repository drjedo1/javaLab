package sec01.exam01_variable;

public class VariableScopeExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int var1;
		
		if(true) 
		{
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 11;
		// var2 = 21; 
		// var2 cannot be resolved to a variable
		// var2는 변수로 해석이 안된다.
		// 왜냐하면 위의 if문에서 사용되고 사라지기 때문에.
		// 중괄호 안에 선언하면 선언한 그 중괄호 안쪽에서만 사용 가능하다.\
		// 변수는 선언된 블록에서만 사용 가능.
	}

}
