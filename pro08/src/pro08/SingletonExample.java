package pro08;
//ΩÃ±€≈Ê(Singleton)Example
public class SingletonExample {
	public static void main(String[] args) {
		
		/*
		Singleton obj1 = new Singleton(); //ø°∑Ø
		Singleton obj2 = new Singleton(); //ø°∑Ø
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("∞∞¿∫ Singleton ∞¥√º ¿‘¥œ¥Ÿ.");
		}
		else {
			System.out.println("¥Ÿ∏• Singleton ∞¥√º ¿‘¥œ¥Ÿ.");
		}
	}

}
