package by.htp.renteq;

public abstract class Equipment {
	private Category category;
	private String title;
	private Statusofequip status;
	private int price;
	
	public Equipment(Category category, String title, Statusofequip status, int price) {
		super();
		this.category = category;
		this.title = title;
		this.status = status;
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public Statusofequip getStatus() {
		return status;
	}

	public int getPrice() {
		return price;
	}
	
	


	
}
