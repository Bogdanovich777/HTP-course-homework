package lesson3;
import java.util.ArrayList;
import java.io.*;


public class Task8 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите число: ");
		int a = Integer.parseInt(in.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		
		while (a >= 1) {
			int one = a % 10;
			array.add(one);
			a = a / 10;
		}
		
		System.out.println("Введите цифру: ");
		
		int digit = Integer.parseInt(in.readLine());
		
		int count = 0;
		
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == digit) {
				array.remove(i);
				i--;
				count++;
			}
		}
		
		if (count == 0) {
			array.add(digit);
		}
		
		for (int i = array.size() -1; i >= 0; i-- ) {
			System.out.println(array.get(i));
		}
	}
	
}

/*Задача 8
		Из натурального числа удалить заданную цифру. Число и цифру вводить с клавиатуры.
		Например, задано число 5683. Требуется удалить из него цифру 8. Получится число 563.

		Решение
		Задача усложняется тем, что заранее неизвестно количество разрядов числа. 
		Поэтому исходное число проще начать проверять с конца с помощью оператора mod (нахождения остатка от деления). 
		Делить надо на 10, чтобы получить последнюю цифру числа.
		Если последняя цифра не совпадает с цифрой, которую требуется удалить, 
		то ее надо перенести в другое число, перед этим сдвинув его разряды. 
		Легче реализовать, чтобы новое число формировалось наоборот: старшие разряды исходного будут младшими.
		После того, как заданная цифр будет удалена, число снова переворачивается.
		Пример выполнения программы:
		38012732
		3
		801272*/
