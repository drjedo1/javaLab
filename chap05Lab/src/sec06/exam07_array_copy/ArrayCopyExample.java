package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] oldStrArray = {" java " , " array " , " copy "};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		 System.arraycopy(src, srcPos, dest, destPos, length);

//			Parameters:
//		src 				the source array.
//		srcPos 			starting position in the source array.
//		dest 			the destination array.
//		destPos 		starting position in the destination data.
//		length 		the number of array elements to be copied.
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
		
		
	}

}
