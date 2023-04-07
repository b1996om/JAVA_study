package sec01.exam27;
// Math 클래스
// 임의의 주사위 눈 얻기 예제
public class MathRandomexample {
	public static void main(String[] args) {
		int num = (int) (Math.random()*6 + 1);
		System.out.println("주사위 눈: " + num);
	}

}
