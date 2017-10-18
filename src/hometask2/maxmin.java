package hometask2;

import java.util.Scanner;
import java.util.Arrays;

public class maxmin {



	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		
        System.out.println("Введите количество чисел: ");

        int a = scan.nextInt();
		int[] mas = new int[a];
        
		
        System.out.println("Введите числа в массив: ");
        for(int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }  
        
        int max = mas [0];
		int min = mas[0];

		
		for ( int i = 0; i < 3; i++ ) {
			if (mas [i] > max) 
				max = mas[i];
				
		}
		
		for ( int i = 0; i < 3; i++ ) {
			if (mas [i] < min ) 
				min = mas[i];
			
		}
		System.out.println("Максимальное значение массива = " + max);
		System.out.println("Минимальное значение массива = " + min);
		
		Arrays.sort(mas);
		System.out.println(Arrays.toString(mas));
		
		
		
	}		

		
}



