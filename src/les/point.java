package les;

import java.util.Scanner;

public class point {
	public static void main(String[] args) {
		int a;
		System.out.println("������� ����� ����� �� 0 �� 9 ");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("����");
		}
		else if (a == 1) {
			System.out.println("����");
		}
		else if (a == 2) {
			System.out.println("���");
		}
		else if (a == 3) {
			System.out.println("���");
		}
		else if (a == 4) {
			System.out.println("������");
		}
		else if (a == 5) {
			System.out.println("����");
		}
		else if (a == 6) {
			System.out.println("�����");
		}
		else if (a == 7) {
			System.out.println("����");
		}
		else if (a == 8) {
			System.out.println("������");
		}
		else if (a == 9) {
			System.out.println("������");
		}
		else {
			System.out.println("������, ����� ����� �� ������������ �������");
		}
		
	}

}
