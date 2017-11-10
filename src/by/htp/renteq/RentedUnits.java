package by.htp.renteq;

import java.util.Date;

public class RentedUnits {
	
	private Equipment[] units;
	private int price;
	private String renter;
	private int id;
	private Date rentDate;
	
	public RentedUnits(Equipment[] units,  String renter, int id, int price, Date rentDate) {
		super();
		this.units = units;
		this.renter = renter;
		this.id = id;
		this.price = price;
		this.rentDate = rentDate;
		
	}

	public Equipment[] getUnits() {
		return units;
	}

	public void setUnits(Equipment[] units) {
		this.units = units;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRenter() {
		return renter;
	}

	public void setRenter(String renter) {
		this.renter = renter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	
	

}
