package lesson3;

public class random {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 100; 
		int c;
		int d;
		int e;
		int z;
		int f;
		
		
		int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
		System.out.println("1-ое случайное число: " + random_number1);
		
		c = random_number1 + 100;
		System.out.println(c);
		
		d = (c / 100);
		System.out.println(d);
		
		e = (c / 10) % 10;
		System.out.println(e);
		
		z = c % 10;
		
		System.out.println(z);
		
		f = d * e * z;
		
		System.out.println(f);
		
		

			   }
			}
