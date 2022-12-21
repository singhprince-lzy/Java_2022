package encapsulation;

public class Animal {

	private int id;
	private String name;
	private double avgWeight;
	private int numOfLegs;
	
	

	public Animal(int id, String name, double avgWeight, int numOfLegs) {
		super();
		this.id = id;
		this.name = name;
		this.avgWeight = avgWeight;
		this.numOfLegs = numOfLegs;
	}
	public Animal() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvgWeight() {
		return avgWeight;
	}
	public void setAvgWeight(double avgWeight) {
		this.avgWeight = avgWeight;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this==obj) {
			return true;
		}
		
		if(obj==null) {
			return false;
		}
		
		if(this.getClass()!=obj.getClass()) {
			return false;
		}
		
		Animal animal= (Animal)obj;
		
		if(this.name==null) {
			if(animal.name!=null) {
				return false;
			}
		}else if(!this.name.equals(animal.name)) {
			return false;
		}
		
		return true;
	}
}
