package sec01.exam01_variable;

// Ŭ����
public class VariableScopeExample2 
{

	// main() �޼ҵ�
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// v1 ���� ����
		int v1 = 15;
		
		if(v1 >10) 
		{
			// v2 ���� ���� -�� ���� ������ ���ڴٴ� ��.
			int v2;
			v2 = v1 - 10;
			System.out.println(v2); 
		}
		
		// <- v2 cannot be resolved to a variable
		System.out.println(v1);
		// System.out.println(v2);
		// ������ ����� �߰�ȣ �������� ��� ����.
	}

}
