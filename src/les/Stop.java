package les;

import java.util.Scanner;

public class Stop {
	public static void main(String [] args) {
		char i;
		do {
			System.out.println("������ ������� �������! \n");
			Scanner scan = new Scanner (System.in);
			i = scan.next().charAt(0);

			} while (i != 'q');
			
		}
	}