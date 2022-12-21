package exercise2_24Aug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class TestPatientList {
	
	public static int getPatientAge(String name,TreeSet<Patient>patient) {
		for(Patient p: patient) {
			if(p.getName().equals(name))return p.getAge();
		}
		return -1;
	}
	
	
	public static void main(String [] args) {
		Patient patient1=new Patient(1, "Vinod Kumar", 29);
		Patient patient2=new Patient(2, "RadheyShayam Kumar", 39);
		Patient patient3=new Patient(3, "Aman Kumar", 19);
		
		List<Patient> patient= new ArrayList<Patient>();
		patient.add(patient1);
		patient.add(patient2);
		patient.add(patient3);
		
		Collections.sort(patient);
		
		//display using for each loop
		for(Patient p: patient) {
			System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge());
			
		}
		
		//display using Iterator
		System.out.println();
		ListIterator<Patient> ltr= patient.listIterator();
		while(ltr.hasNext()) {
			Patient p= (Patient)ltr.next();
			System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge());
		}
		
		//Add all objects into a treeset
		TreeSet<Patient>pt= new TreeSet<>(patient);
		System.out.println(pt);
		
		//gettinr patient age by name
		System.out.println(getPatientAge("RadheyShayam Kumar", pt));
		
	
}
}
