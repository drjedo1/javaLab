package sec05.exam04_local_variable_access;

public class Anonymous {
	// �ʵ�
	private int field;
	
	// ������
	
	// �޼ҵ�
	public void method(final int arg1, final int arg2) {
		final int var1 = 0;
		final int var2 = 0; // ���ú������� ���ÿ� ����ȴ�.
		
		field = 10; // �ۿ��ִ� �ʵ�
		
//	Local variable arg1 defined in an enclosing scope 
//	must be final or effectively final
//		arg1= 20;
		
		//  ���޸𸮿� ����Ǵ� ����. ~ return ~ }; ����
		// ���ú��� calc�� �͸� ���� ��ü�� ���Խ�Ų��.
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				

				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			} // sum() ends
		}; // Calculatable() ends
	} // method() ends
	
} // Anonymous ends
