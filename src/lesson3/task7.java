package lesson3;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("������� ���: ");
		a = sc.nextInt();
		
		if ( a % 4 > 0 ) {
			System.out.println("� ���� ���� 365 ����!");
			
		}
		else if ( a % 100 > 0) {
			System.out.println("� ���� ���� 366 ����!!");
		}
		else if (a % 400 > 0) {
			System.out.println(" � ����  ���� 365 ����! ");
		}
		
		

	}

}




/*������ 7
���������� ���������� ���� � ����, ������� ������ ������������.
� ���������� ���� - 366 ����, ����� ��� � ������� 365.
 ����������� ������ �������� ��� ���� ��������� ������ �� 4 �� ����������� ��������, ������� �� ������� ������ �� 400.
�������
�������� ������� ������: 
��������� ������� �� ��� �� 4. ���� ���, �� ��� ��� ������������.
���� ��� ������� �� 4, �� ��������� ������� �� �� �� 100. ���� ���, �� ��� ���������� ����������.
���� ��� ������� �� 100, �� ��� ���� �� ������� �� 400, �� ��� ������������.*/
