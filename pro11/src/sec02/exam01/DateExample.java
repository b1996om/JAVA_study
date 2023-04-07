package sec02.exam01;
// java.util 패키지 (import해야함)
// Date클래스 : 날짜를 표현하는 클래스

import java.text.*;  //SimpleDateFormat을 사용하기 위해 임포트 해줘야 한다.
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);  //Thu Nov 24 16:28:04 KST 2022
		
		
		//SimpleDateFormat 사용하면 한국인이 보기 편하게 출력된다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);  //2022년 11월 24일 04시 28분 04초
	}

}
