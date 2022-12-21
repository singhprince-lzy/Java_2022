package polymorphism;

public class Bike extends AbstractManufacturer{
	
	public Bike(String name, String model,String type) {
		super(name,model,type);
	}

	@Override
	public int maxSpeed(String type) {
		return 120;
	}

	@Override
	public String getManufacturerInformation() {
		return "car{"+this.getName()+","+this.getModelNumber()+","+this.getType()+"}.";
	}

}
