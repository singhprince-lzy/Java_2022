package anagramCode;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2= sc.nextLine();
		Anagram ana= new Anagram();
		String str=ana.checkAnagrams(s1, s2);	
		System.out.println(str);
		

	}
	//given phrases are anagrams
	//given phrases are not anagrams
	public String checkAnagrams(String str1,String str2) {
		int str1length=str1.length();
		int str2length=str2.length();
		if(str1length==0 || str2length==0) {
			return "Give Proper input";
		}
		else if(str1length!=str2length) {
			return "given phrases are not anagrams";
		}
		else {
			char [] charr1=str1.toCharArray();
			char [] charr2=str2.toCharArray();
			Arrays.sort(charr2);
			Arrays.sort(charr1);
			for(int i=0;i<str1length;i++) {
				if(charr1[i]!=charr2[i]) {
					return "given phrases are not anagrams";
				}
			}
			return "given phrases are anagrams";
		}
		
	}

}
