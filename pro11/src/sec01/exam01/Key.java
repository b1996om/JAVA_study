package sec01.exam01;
//��ü �ؽ��ڵ� - hashCode()
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
	
	@Override  // hashCode() �޼ҵ� ������ �߰�! , �ϸ� "ȫ�浿"�� �� ��µ�.
	public int hashCode() {
		return number;
		}
 }
