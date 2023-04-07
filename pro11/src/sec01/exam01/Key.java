package sec01.exam01;
//객체 해시코드 - hashCode()
public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override  // hashCode() 메소드 재정의 추가! , 하면 "홍길동"이 잘 출력됨.
	public int hashCode() {
		return number;
		}
 }
