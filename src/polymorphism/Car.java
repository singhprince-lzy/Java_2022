package polymorphism;

public class Car extends AbstractManufacturer{
	
	public Car(String name, String model,String type) {
		super(name,model,type);
	}

	@Override
	public int maxSpeed(String type) {
		// TODO Auto-generated method stub
		return 180;
	}

	@Override
	public String getManufacturerInformation() {
		// TODO Auto-generated method stub
		
		return "car{"+this.getName()+","+this.getModelNumber()+","+this.getType()+"}.";
	}
	
	

	

}
