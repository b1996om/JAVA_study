package prac_01;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		//�ֹ��� �� 5������ ����
		String[] orderList = new String[5];
		int total = 0; 
		
		while(true) {
			System.out.println("***Cafe***");
			System.out.println("1. �ֹ��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�Է�: ");
			int num = sc.nextInt();
			if(num==1) {
				String menuName = "";
				int menuPrice = 0;
				System.out.println("***Menu***");
				System.out.println("1. �Ƹ޸�ī��\t3800��");
				System.out.println("2. ����������\t2400��");
				System.out.println("3. ī���\t4200��");
				System.out.println("4. ��ũƼ\t5100��");
				System.out.print("�ֹ��� �޴� : ");
				System.out.println();
				int menuNum = sc.nextInt();
				if(menuNum==1) {
					menuName="�Ƹ޸�ī��";
					menuPrice=3800;
				}
				else if(menuNum==2) {
					menuName="����������";
					menuPrice=2400;
				}
				else if(menuNum==3) {
					menuName="ī���";
					menuPrice=4200;
				}
				else if(menuNum==4) {
					menuName="��ũƼ";
					menuPrice=5100;
				}
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
				System.out.println("�ֹ��� �޴���"+menuName+"�Դϴ�.");
				System.out.println("������"+menuPrice+"�Դϴ�.");
				System.out.println();
			}
			else if(num==2) {
				
			}
			else if(num==3) {}
			else if(num==4) {
				System.out.println("�ݺ� ����!");
				break;
			}
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}

}