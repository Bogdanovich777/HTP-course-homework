package by.htp.salad.recipe;

import by.htp.salad.Salad;
import by.htp.salad.type.Apple;
import by.htp.salad.type.Banana;
import by.htp.salad.type.Grape;

public class FruitSalad extends Salad {

	public FruitSalad(String fruitsalad) {
		super(fruitsalad);
		
		addIngredient(new Apple(300));
		addIngredient(new Banana(400));
		addIngredient(new Grape(400));
	}
	
	
	
}
