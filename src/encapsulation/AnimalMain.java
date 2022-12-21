package encapsulation;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani= new Animal(1,"Deer",102,4);
		Animal animal= new Animal();
		
		System.out.println(ani.hashCode()+" "+animal.hashCode());

	}

}
