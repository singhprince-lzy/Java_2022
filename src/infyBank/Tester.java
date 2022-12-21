package infyBank;

public class Tester {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Applicant a= new Applicant();
		a.setApplicantAge(37);
		a.setApplicantName("Prince");
		a.setPostName("Probetionary Officer");
		
		Validator v= new Validator();
		try {
			v.validate(a);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
