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
		// var2�� ������ �ؼ��� �ȵȴ�.
		// �ֳ��ϸ� ���� if������ ���ǰ� ������� ������.
		// �߰�ȣ �ȿ� �����ϸ� ������ �� �߰�ȣ ���ʿ����� ��� �����ϴ�.\
		// ������ ����� ��Ͽ����� ��� ����.
	}

}
