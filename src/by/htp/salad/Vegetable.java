package by.htp.salad;

public class Vegetable extends Products {
	
	public Vegetable(String name, double colories) {
		super(name, colories);
		setCategory("Vegetable");
	}
	
	public Vegetable(String name, double colories, double weight) {
		super(name, colories, weight);
		setCategory("Vegetable");
	}
}
