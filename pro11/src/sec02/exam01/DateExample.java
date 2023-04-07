package sec02.exam01;
// java.util ��Ű�� (import�ؾ���)
// DateŬ���� : ��¥�� ǥ���ϴ� Ŭ����

import java.text.*;  //SimpleDateFormat�� ����ϱ� ���� ����Ʈ ����� �Ѵ�.
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);  //Thu Nov 24 16:28:04 KST 2022
		
		
		//SimpleDateFormat ����ϸ� �ѱ����� ���� ���ϰ� ��µȴ�.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);  //2022�� 11�� 24�� 04�� 28�� 04��
	}

}
