package les;
import java.util.Scanner;
public class Example {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
	    char value;
		System.out.println("������� ����� ����� �: ");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		System.out.println("������� ����� ����� b: ");
		b = scan.nextInt();
		System.out.println("������� ���� �������� ");
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
			System.out.println("��� �� �������������� ��������");
		}
	}
}
