package linkedList;
// LinkedList : ArrayList와 사용 방법은 같으나 내부 구조가 다름
//            : 특정 인덱스 객체 제거하거나 삽입하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않음
// ArrayList보다 LinkedList가 작업속도가 빠르다.
import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
	    //ArrayList 걸린시간: 4793100 ns
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		//LinkedList 걸린시간: 1282700 ns
	}
}
