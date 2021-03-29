package sec05_try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) /*throw Exception*/ {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;

//		try {
//			fis = new FileInputStream("file.txt");
//			fis.read(); // file.txt�� �н��ϴ�.
//			throw new Exception(); // ���ܸ� ������ �߻���Ų��.
//		} catch(Exception e) {
//			System.out.println("���� ó�� �ڵ尡 �߻��Ǿ����ϴ�.");
//		} finally { // catch ends
//			fis.close();
//		} // finally ends

		// �ڵ����� ���ҽ��� �ݴ´�.
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read(); // file.txt�� �н��ϴ�.
			throw new Exception();
		} catch (Exception e) { // try ends
			System.out.println("���� ó�� �ڵ尡 �߻��Ǿ����ϴ�.");
		} // catch ends
		
	} // main ends
	
} // class ends
