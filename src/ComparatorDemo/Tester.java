package ComparatorDemo;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Student st1= new Student(1,"Prince", 22, 45000);
		Student st2= new Student(0,"Atesh", 22, 45000);
		ArrayList as= new ArrayList();
		as.add(st1);
		as.add(st2);
		as.sort(st1);
		System.out.println(as);
		

	}

}
