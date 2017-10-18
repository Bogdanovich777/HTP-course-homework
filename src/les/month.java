package les;


import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		String a = "january";
		String b = "february";
		String c = "march";
		String d = "april";
		String e = "may";
		String f = "june";
		String g = "july";
		String k = "august";
		String l = "september";
		String m = "october";
		String n = "november";
		String o = "december";
		String line;
		
		
		System.out.println("Write the name of the month");
		line = scan.next();
		if (line.equals(a) ||  line.equals(b) || line.equals(o)) {
			System.out.println("It's WINTER!");
		}
		else if (line.equals(c) ||  line.equals(d) || line.equals(e)) {
			
			System.out.println("It's SPRING!!!");
		}
		else if (line.equals(f) ||  line.equals(g) || line.equals(k)) {
			System.out.println("It's SUMMER!!!");
		}
		else if (line.equals(l) ||  line.equals(m) || line.equals(n)) {
			System.out.println("It's AUTUMN!");
		}
		
		else {
			System.out.println("Wrong name!");
		}
		
		
		

	}

}
