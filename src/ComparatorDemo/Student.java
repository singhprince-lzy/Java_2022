package ComparatorDemo;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	public int id;
	public String name;
	public int age;
	public double salary;
	
	public Student() {
		super();
	}


	public Student(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.length()>o2.name.length()) {
			return 1;
		}else if(o1.name.length()<o2.name.length()) {
			return -1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
