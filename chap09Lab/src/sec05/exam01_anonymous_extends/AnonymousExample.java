package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		// �� Ŭ������ ��ü �����
		// �� Ŭ���� Ÿ���� ��ü �����. Ŭ���� �����ڸ� ���ؼ�
		Anonymous anony = new Anonymous();
		
		anony.field.wake(); // �ʵ忡 ������
		
		anony.method1(); // ���� ������ ���� ��.
		
		// �Ű� ������ �͸��ڽİ�ü�� ����Ѵ�.
		anony.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
			
		});
	}

}
