package lesson3;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		double d; //������� ������
		double e; // ������� ������
		double f; // ����� �������
		double h;
		
		
		

		System.out.println("������� ������� ����: ");
		a = sc.nextInt();
		System.out.println("������� ������ ����: ");
		b = sc.nextInt();
		System.out.println("������� ������ ������: ");
		c = sc.nextInt();
		
		d = Math.PI * a * a / 4;
		System.out.println("������� ������ = " + d);
		
		e = Math.PI * a * b;
		System.out.println("������� ������ = " + e);
		
		f = d + e;
		System.out.println("����� ������� = " + f);
		
		h = f / c;
		System.out.println("���������� ����� = " + h);
		
		System.out.println(Math.ceil(h));
		


	}

}



/*������ 3
��������, ����������� ����� ��������� ������� ���� �������������� �����. ��� ���� ��� ������ ������ ������� ����� � ������ � ������� �������.
����������� ��������� ���������, ������� �� ����������, ������� ����� ������ ���������� ��� �������� ���� ��� ����� ����.

�������
��������� ������ ����������� � ������������ ��������� ����������:
������� ����;
������ ����;
������ ������ (������� �����������, ������� ����� ��������� ����� ������ ������).
� ���������� ��������� ������ �������� ���������� ��������� �����. ��� ��������� �������� ����� ���������� ������ ������ ����������� � ������� �������.
������� ����� ���� (�����) ����������� �� ������� p * d2 /4 (��� p � ����� ��, d - �������).
������� ������� ����������� ��������: p * d * h (��� h � ������).*/
