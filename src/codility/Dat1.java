package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dat1 {
	
	public int solution(String str) throws Exception {
		int len=str.length();
		String s="";
		int max=-1;
		for(int i=0;i<len-1;i++) {
			s+=str.charAt(i)+str.charAt(i+1);
			
			int num=Integer.valueOf(s);
			max=Math.max(max, num);
		}
		return max;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Dat1 d= new Dat1();
//		System.out.println(d.solution("50552"));
//		//System.out.println(d.solution("10101"));
//		System.out.println(d.solution("88"));
		
		int[] arr= {1,2,3};
		List<int[]>al= new ArrayList<>();
		List li=new ArrayList<>();
		al=Arrays.asList(arr);
		
		System.out.println(li);
		
		

	}

}
