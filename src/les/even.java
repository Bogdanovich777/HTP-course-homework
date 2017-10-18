package les;

import java.util.Scanner;

public class even {
	public static void main(String[] args) {
		int a;
		System.out.println("Введите любую цифру от 0 до 9 ");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		if ( a % 2 > 0) {
			System.out.println("Число нечетное");
		
			
		}
		else {
			System.out.println("Всё ок, число четное");
		}
	}

}
