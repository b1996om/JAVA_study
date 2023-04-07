package Exceptions;
//다중 catch
//다중 catch 블록 작성 시 상위 예외 클래스(Exception)가 하위 예외 클래스보다 아래 위치해야함.
public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		}
		//항상 출력되는 finally 구문.
		finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
