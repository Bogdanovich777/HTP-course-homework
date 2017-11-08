package by.htp.salad;

public class Fruit extends Products {
	

	public Fruit(String name, double colories) {
		super(name, colories);
		setCategory("Fruits");
	}
	public Fruit(String name, double colories, double weight) {
		super(name, colories, weight);
		setCategory("Fruits");
	}
}
