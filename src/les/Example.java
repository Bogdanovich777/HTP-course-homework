package les;
import java.util.Scanner;
public class Example {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
	    char value;
		System.out.println("¬ведите любое число а: ");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		System.out.println("¬ведите любое число b: ");
		b = scan.nextInt();
		System.out.println("¬ведите знак действи€ ");
		value = scan.next().charAt(0);
		
		
		if (value == '-'){
			c = a - b;
			System.out.println(c);
		}
		else if (value == '+') {
			c = a + b;
			System.out.println(c);
		}
		else if (value == '*') {
			c = a * b;
			System.out.println(c);
		}
		else if (value == '/') {
			c = a / b;
			System.out.println(c);
		}
		else {
			System.out.println("Ёто не арифмитическое действие");
		}
	}
}
