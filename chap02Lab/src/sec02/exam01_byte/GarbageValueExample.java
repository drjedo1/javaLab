package sec02.exam01_byte;

public class GarbageValueExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// -128 <= byte <= 127
		byte var1 = 125;
		
		// -2^31 <= int <= 2^31-1
		int var2 = 125;
		
		
		// �ݺ���
		// i=0���� �ϳ��� �����Ͽ� 5���� ���������� �ݺ��Ѵ�.
		for (int i=0; i<5; i++) 
		{
			var1++; // var1 = var1 + 1;  // 125 + 1 = 126
			var2++; // var2 = var2 + 1; // 125+ 1=126
			System.out.println("var1="+var1);
			System.out.println("var2="+var2);
			
			/*
					var1=126
					var2=126
					var1=127
					var2=127
							var1=-128
					var2=128
							var1=-127
					var2=129
							var1=-126
					var2=130
			*/
		} // end of for loop

	} // end of main method

} // end of class GVE
