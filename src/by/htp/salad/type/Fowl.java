package by.htp.salad.type;

import by.htp.salad.Meat;

public class Fowl extends Meat {
	
	public Fowl() {
		super("Chicken", 170);
	}
	
	public Fowl(double weight) {
		super("Chicken", 170, weight);
	}

}
