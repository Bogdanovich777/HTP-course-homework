package les;

import java.util.Scanner;

public class Minus {
	public static void main(String[] args) {
		int a;
		System.out.println("������� ����� ����� �� -9 �� 9 ");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		if ( a % 2 > 0 || a < 0  ) {
			
			System.out.println("�� �������� ������� ������");
		
			
		}
		else {
			System.out.println("�� ��, ����� ������");
		}
	}

}
