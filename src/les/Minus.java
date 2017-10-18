package les;

import java.util.Scanner;

public class Minus {
	public static void main(String[] args) {
		int a;
		System.out.println("Введите любую цифру от -9 до 9 ");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		if ( a % 2 > 0 || a < 0  ) {
			
			System.out.println("Не подходит условию задачи");
		
			
		}
		else {
			System.out.println("Всё ок, число четное");
		}
	}

}
