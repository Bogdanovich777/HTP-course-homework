package les;

import java.util.Scanner;

public class Stopprog {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		while (true) {
			System.out.println("������� �������! \n ");
			String a = scan.nextLine();
			if (a.equals("stop")) {
				break;
			}
		}
	}
}
	

