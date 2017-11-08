package by.htp.salad;

public abstract class Products {

	private String name;
	private String category;
	private double kcalPer100g;
	private double weight;
	


	
	public Products (String name, double calories) {
		if (calories < 0) {
			throw new IllegalArgumentException("Cannot create products with "
					+ calories + "kcal");
		}
		
		this.name = name;
		this.kcalPer100g = calories;
	}
	public Products (String name, double calories, double weight) {
		
		this.name = name;
		this.kcalPer100g = calories;
		this.weight = weight;
	}
	
		

	public String toString() {
		return (weight + " gramms of " + name + " (" + category + "), " + getAllCalories() + "kcal");
	}


	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getKcalPer100g() {
		return kcalPer100g;
	}
	
	public double getAllCalories() {
		return kcalPer100g * weight / 100.0;
	}
		

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setKcalPer100g(double kcalPer100g) {
		this.kcalPer100g = kcalPer100g;
	}
}
