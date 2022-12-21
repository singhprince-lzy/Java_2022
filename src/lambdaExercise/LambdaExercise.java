package lambdaExercise;

//Harvey wants to display the name of all the employees and their gender. Help him in writing this code using lambda expressions


import java.util.ArrayList;
import java.util.function.Consumer;

class LambdaExercise {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1069001, "John", 100000, 1.0, "Manager", "M");
		Employee e2 = new Employee(1069002, "Mike", 50000, 1.7, "Systems Engineer", "M");
		Employee e3 = new Employee(1069003, "Harvey", 75000, 6.9, "Manager", "M");
		Employee e4 = new Employee(1069004, "Jessica", 25000, 3.1, "Trainee", "F");
		Employee e5 = new Employee(1069005, "Rachel", 53000, 2.0, "Support", "F");

		ArrayList<Employee> employeeArr = new ArrayList<>();
		employeeArr.add(e1);
		employeeArr.add(e2);
		employeeArr.add(e3);
		employeeArr.add(e4);
		employeeArr.add(e5);
      
      // Write your code here
		Consumer<Employee> consumer  = (value)->{
			System.out.println("Employee Id: "+value.getId());
			System.out.println("Employee name: "+value.getName());
			System.out.println("Employee salary: "+value.getSalary());
			System.out.println("Employee role: "+value.getRole());
			System.out.println("Employee gender: "+value.getGender());
			System.out.println("Years in organization: "+value.getYearsInOrg());
			System.out.println();
			
		};
		for(Employee e:employeeArr) {
			consumer.accept(e);
		}
      
	}
}

class Employee {
	public int id;
	public String name;
	public int salary;
	public double yearsInOrg;
	public String role;
	public String gender;

	public Employee(int id, String name, int salary, double years, String role, String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearsInOrg = years;
		this.role = role;
		this.gender = gender;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getYearsInOrg() {
		return yearsInOrg;
	}

	public void setYearsInOrg(double yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
