package polymorphism;

abstract class AbstractManufacturer implements Vehicle{

	private String name;
	private String modelNumber;
	private String type;
	public AbstractManufacturer(String name2, String model, String type2) {
		// TODO Auto-generated constructor stub
		this.name=name2;
		this.modelNumber=model;
		this.type=type2;
	}
	
	public String getName() {
		return name;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public String getType() {
		return type;
	}
	
	public abstract String getManufacturerInformation();
	
	
	
}
