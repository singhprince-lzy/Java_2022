package polymorphism;

public class VehicleService {

	public Car createCar(String name,String model,String type) {
		AbstractManufacturer absm=new Car(name,model,type);
		return (Car) absm;
		
	}
	
	public Bike createBike(String name,String model,String type) {
		AbstractManufacturer absm=new Car(name,model,type);
		return (Bike) absm;
		
	}
	
	public int compareMaxSpeed(Vehicle v1,Vehicle v2) {
		VehicleService vs= new VehicleService();
		
		Vehicle v3=vs.createCar("TATA","BR0472SE","Mustang"); 
		Vehicle v4= vs.createBike("Royal Enfield","BR0456DE","Classic");
		
		if(v4.maxSpeed("Mustang")>v3.maxSpeed("Classic")) {
			return v4.maxSpeed("Mustang");
		}
		return v3.maxSpeed("Classic");
		
	}
}
