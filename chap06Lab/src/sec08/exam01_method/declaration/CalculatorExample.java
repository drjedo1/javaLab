package sec08.exam01_method.declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalc = new Calculator(); 
		// �� ���� Calculator�� Ŭ���� Ÿ���� ��Ÿ����.
		// myCalc ȣ�� ����
		
		// "." �Է��ؼ� ������ �ʵ�. �ﰢ���� ���� �ۼ��� ��. ������ ��ӹ��� �޼ҵ�.
		myCalc.powerOn();
		// �� ������ �߿��ϴ�. ��ü�� ���� �޼ҵ带 ȣ���Ѵ�.
		
		int result1 = myCalc.plus(5, 6); // result = 11
		System.out.println("result1="+result1);
		
		byte x = 10;
		byte y = 4;
//		myCalc.divide(x, y); // �ڵ� ����ȯ �ȴ�. byte->int
		double result2 = myCalc.divide(x, y); // �ڵ� ����ȯ �ȴ�. byte->int
		System.out.println("result2="+result2);
		
		myCalc.powerOff();
		
	}

}
