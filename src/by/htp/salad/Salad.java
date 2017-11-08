package by.htp.salad;

import java.util.ArrayList;
import java.util.List;

public class Salad {

	private String name; // the name of the salad
	private List<Products> ingredients = new ArrayList<Products>();
	
	
	public Salad(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public List<?> getIngredients() {
		return ingredients;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public boolean addIngredient(Products products) {
		return ingredients.add(products);
	}
	
	public void showRecipe() {
		System.out.println(name);
	}
	
	public double countCalories() {
		double calories = 0.0;
		
		for (Products products : ingredients) {
			calories += products.getAllCalories();
		}
		
		return calories;
	}
	
}


