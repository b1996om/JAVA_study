package pro02;
//문자열을 기본타입으로 강제형변환
public class PrimitiveAndStringConversionExam {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1); //10
		System.out.println(value2); //3.14
		System.out.println(value3); //true
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println(str1); //10
		System.out.println(str2); //3.14
		System.out.println(str3); //true
	}
}
