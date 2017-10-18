package lesson3;
import java.util.ArrayList;
import java.io.*;


public class Task8 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� �����: ");
		int a = Integer.parseInt(in.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		
		while (a >= 1) {
			int one = a % 10;
			array.add(one);
			a = a / 10;
		}
		
		System.out.println("������� �����: ");
		
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

/*������ 8
		�� ������������ ����� ������� �������� �����. ����� � ����� ������� � ����������.
		��������, ������ ����� 5683. ��������� ������� �� ���� ����� 8. ��������� ����� 563.

		�������
		������ ����������� ���, ��� ������� ���������� ���������� �������� �����. 
		������� �������� ����� ����� ������ ��������� � ����� � ������� ��������� mod (���������� ������� �� �������). 
		������ ���� �� 10, ����� �������� ��������� ����� �����.
		���� ��������� ����� �� ��������� � ������, ������� ��������� �������, 
		�� �� ���� ��������� � ������ �����, ����� ���� ������� ��� �������. 
		����� �����������, ����� ����� ����� ������������� ��������: ������� ������� ��������� ����� ��������.
		����� ����, ��� �������� ���� ����� �������, ����� ����� ����������������.
		������ ���������� ���������:
		38012732
		3
		801272*/
