package by.htp.salad;

public class Meat extends Products {
	
	public Meat(String name,double colories) {
		super(name,colories);
		setCategory("Meat");
	}
	public Meat(String name, double colories, double weight) {
		super(name, colories, weight);
		setCategory("Meat");
	}
}
