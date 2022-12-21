package constructor;

import java.util.List;

public class Traveller {

	private int id;
	private String travelType;
	private double price;
	private List<String> location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTravelType() {
		return travelType;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	// default constructor
	public Traveller() {
		super();
	}

	// parameterized constructor with one property id
	public Traveller(int id) {
		super();
		this.id = id;
	}

	// parameterized constructor with two property id,travelType
	public Traveller(int id, String travelType) {
		super();
		this.id = id;
		this.travelType = travelType;
	}

	// parameterized constructor with three property id,travelType,price
	public Traveller(int id, String travelType, double price) {
		super();
		this.id = id;
		this.travelType = travelType;
		this.price = price;
	}

	// parameterized constructor with all property id,travelType,price,location
	public Traveller(int id, String travelType, double price, List<String> location) {
		super();
		this.id = id;
		this.travelType = travelType;
		this.price = price;
		this.location = location;
	}

	
	
	@Override
	public String toString() {
		return "Traveller {id=" + id + ", travelType=" + travelType + ", price=" + price + ", location=" + location
				+ "}";
	}

	public String getTraveller() {
		return this.travelType;
	}

}
