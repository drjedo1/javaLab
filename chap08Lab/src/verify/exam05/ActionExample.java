package verify.exam05;

public interface ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ۼ� ��ġ
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		action.work();

	// ���� ���
	// ���縦 �մϴ�.
	}// main ends

} //class ends


//ActionExample Ŭ������ main() �޼ҵ忡�� Action�� �͸� ���� ��ü�� ����� 
//������ ���� ���� ����� ���� �� �ֵ��� �ڽ� �ȿ� �� �ڵ带 �ۼ��غ�����.