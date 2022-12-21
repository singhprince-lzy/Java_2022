package exercise2_24Aug;

import java.util.Comparator;

public class Patient implements Comparable<Patient> {
	private int patientId;
	private String name;
	private int age;
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Patient o2) {
		return -this.getName().compareTo(o2.getName());
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}
	
}
