package sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] strArray = new String[3];
	strArray[0] = "Java";
	strArray[1] = "Java";
	strArray[2] = new String("Java");
	
	System.out.println(strArray[0]==strArray[1]); // 값 자체를 가지고 있는 배열이라 true
	System.out.println(strArray[0]==strArray[2]); // [2]는 주소를 가지고 있는 것이기 때문에 값이 같다고 할 수 없다.
	System.out.println(strArray[0].equals(strArray[2])); // 값을 비교해주는 필드를 이용하면 오류 없이 값 비교를 할 수 있다.
	
	
	
	
	
	}
}
