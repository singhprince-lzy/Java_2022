package constructor;

import java.util.*;

public class TravellerMain {
	public static void main(String[] args) {
		List<String>loc= new ArrayList<>();
		loc.add("Bihar");
		loc.add("UP");
		loc.add("Delhi");
		Traveller t= new Traveller(1,"solo",1500,loc);
		System.out.println(t);
		
		TravellerMain tm= new TravellerMain();
		System.out.println(tm.getTravellerDetails(t));
		System.out.println(t.getTraveller());
		
	}
	
	public String getTravellerDetails(Traveller t) {
		return t.toString();
	}
}
