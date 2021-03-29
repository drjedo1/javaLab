package sec05.exam01_anonymous_extends;

public class Anonymous {
	//�ʵ� �ʱⰪ���� �͸� �ڽ� ��ü�� ����

	// �߰�ȣ ���̴� Person�� ��ü. �߰�ȣ �߰����ʹ� �͸� �ڽ� ��ü�� �߰�ȣ �ȿ� �ִ´�.
	
	//�ʵ��� �ʱⰪ���� �͸� �ڽ� ��ü�� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	}; 
	void method1() {
		//���� ���������� �͸� �ڽ� ��ü�� ����.
		Person localVal = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		}; // Person() ends
		// ���ú��� ���
		localVal.wake();
	} // method1() ends
	void method2(Person person) {
		person.wake();
	}
} // cls Anon ends
