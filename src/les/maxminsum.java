package les;

import java.util.Scanner;

public class maxminsum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		
        System.out.println("������� ���������� �����: ");

        int a = scan.nextInt();
		int[] mas = new int[a];
        
        System.out.println("������� ����� � ������: ");
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
		int sum;
		sum = max + min;
		System.out.println("����� ������������ � ������������� ����� �����: " + sum);
			
			
			
		
	}

}

