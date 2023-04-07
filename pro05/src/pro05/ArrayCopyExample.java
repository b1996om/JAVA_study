package pro05;
//배열 복사 - System.arraycopy()사용
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ","); // java,array,copy,null,null,
			                                        // -> array[5] 중에 빈 공간은 null로 채워짐.
		}
	}

}
