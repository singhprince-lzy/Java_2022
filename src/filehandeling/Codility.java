package filehandeling;

import java.io.*;

public class Codility {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new FileReader("S.txt"));
		String s= br.readLine();
		int minlength=1000;
		while(s!=null) {
			String [] strArray=s.split(" ");	
			if(strArray[0].equals("root")&&strArray[1].startsWith("r")&&
					(strArray[2].contains(".doc")||strArray[2].contains(".xls")||strArray[2].contains(".pdf"))) {
				minlength=Math.min(minlength, strArray[2].length());
			}
			s=br.readLine();
		}
		System.out.println(minlength);
	}

}
