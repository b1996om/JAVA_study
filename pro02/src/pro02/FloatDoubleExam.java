package pro02;

public class FloatDoubleExam {

	public static void main(String[] args) {
		//�Ǽ��� ����
		//float var1 = 3.14;  //������ ����
		float var2 = 3.14f;
		double var3 = 3.14;

		//���е� �׽�Ʈ
		float var4 = 0.1234567890123456789f; 
		double var5 = 0.1234567890123456789; 
		
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4); //var4:0.12345679
		System.out.println("var5:" + var5); //var5:0.12345678901234568
		
		//e ����ϱ�
		double var6 = 3e6; 
		float var7 = 3e6F;
		double var8 = 2e-3;
        System.out.println("var6:" + var6);	//var6:3000000.0
        System.out.println("var7:" +var7);	//var7:3000000.0
        System.out.println("var8:" +var8);	//var8:0.002
	}
}
