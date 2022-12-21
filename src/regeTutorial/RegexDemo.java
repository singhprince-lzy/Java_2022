package regeTutorial;
import java.util.regex.*;

class Demo{
	public boolean mobileNumber() {
		String regex="(91|0)?[6-9][0-9]{9}";//
		String target="9507116503";
		return target.matches(regex);
	}
	public boolean Email() {
		String regex="[a-zA-Z0-9]*@gmail.com";//
		String target="pk72044kkkkkkk@gmail.com";
		return target.matches(regex);
	}	
}

public class RegexDemo {
	public static void main(String[] args) {	
		Demo d= new Demo();
		System.out.println(d.Email());
		// TODO Auto-generated method stub
				/*Pattern p= Pattern.compile("aa");
				Matcher m= p.matcher("Abbaaacader");
				while(m.find()) {
					System.out.println(m.start()+"--"+m.end()+"-->"+m.group());
				}*/

	}

}
