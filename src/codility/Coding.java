package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Coding {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		String password=sc.next();
		int length=password.length();
		boolean spchar=false;
		boolean number=false;
		boolean upper=false;
		boolean lower=false;
		boolean has=false;
		
		if(password.charAt(length-1)=='$') {
			has=true;
		}
		
		Set<Character> set=new HashSet<>(
			Arrays.asList('!','@','#','%','^','&','*','(',')','_','+','$'));
		
		for(int i=0;i<length;i++) {
			if(Character.isDigit(password.charAt(i))) {
				number=true;
			}
			if(Character.isUpperCase(password.charAt(i))) {
				upper=true;
			}
			if(Character.isLowerCase(password.charAt(i))) {
				lower=true;
			}
			if(set.contains(password.charAt(i))) {
				spchar=true;
			}
		}
		
		if(upper && lower&& spchar && number && length>=8 && password.charAt(length-1)=='$') {
			System.out.println("Your Password is Strong");
		}
		else {
			System.out.println("Your Password is Not Strong");
		}
		
	}
}
