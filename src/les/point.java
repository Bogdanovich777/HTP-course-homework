package les;

import java.util.Scanner;

public class point {
	public static void main(String[] args) {
		int a;
		System.out.println("Введите любую цифру от 0 до 9 ");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("нуль");
		}
		else if (a == 1) {
			System.out.println("один");
		}
		else if (a == 2) {
			System.out.println("два");
		}
		else if (a == 3) {
			System.out.println("три");
		}
		else if (a == 4) {
			System.out.println("четыре");
		}
		else if (a == 5) {
			System.out.println("пять");
		}
		else if (a == 6) {
			System.out.println("шесть");
		}
		else if (a == 7) {
			System.out.println("семь");
		}
		else if (a == 8) {
			System.out.println("восемь");
		}
		else if (a == 9) {
			System.out.println("девять");
		}
		else {
			System.out.println("Ошибка, число вышло за обозначенные границы");
		}
		
	}

}
