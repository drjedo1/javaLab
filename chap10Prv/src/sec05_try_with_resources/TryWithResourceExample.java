package sec05_try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) /*throw Exception*/ {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;

//		try {
//			fis = new FileInputStream("file.txt");
//			fis.read(); // file.txt을 읽습니다.
//			throw new Exception(); // 예외를 강제로 발생시킨다.
//		} catch(Exception e) {
//			System.out.println("예외 처리 코드가 발생되었습니다.");
//		} finally { // catch ends
//			fis.close();
//		} // finally ends

		// 자동으로 리소스를 닫는다.
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read(); // file.txt을 읽습니다.
			throw new Exception();
		} catch (Exception e) { // try ends
			System.out.println("예외 처리 코드가 발생되었습니다.");
		} // catch ends
		
	} // main ends
	
} // class ends
