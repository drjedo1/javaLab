package sec04.exam02_synchronized;

// 5���� Thread�� ����� ���� ��Ű�� Ŭ����

public class ManageToilet {

    public static void main( String[] args ) {
		Toilet t = new Toilet();

		// thread ����
		Family father = new Family("�ƹ���", t );
		Family mother = new Family("��Ӵ�", t );
		Family sister = new Family("����", t );
		Family brother = new Family("��", t );
		Family me = new Family("��", t );

/*** �켱 ���� ����ȵ�
		father.setPriority(10);
		mother.setPriority(7);
		sister.setPriority(5);
		brother.setPriority(3);
		me.setPriority(1);
*/

		// �� Thread�� Runnable ���¿� ��
		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
    }
}