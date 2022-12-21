package infyBank;

public class Validator {

	public void validate(Applicant applicant) throws InvalidNameException,InvalidAgeException,InvalidPostException {
		if(!isValidName(applicant.getApplicantName())) {
			throw new InvalidNameException("Invalid name exception");
		}
		
		if(!isValidAge(applicant.getApplicantAge())) {
			throw new InvalidAgeException("Invalid age");
		}
		
		if(!isValidPost(applicant.getPostName())) {
			throw new InvalidPostException("Invalid post.");
		}
		System.out.println("All the values are Valid.");
	}
	
	public boolean isValidName(String name) {
		if(name.equals("") || name.equals(null)) {
			return false;
		}
		return true;
	}
	
	public boolean isValidPost(String postName) {
		if(postName.equalsIgnoreCase("Probetionary Officer")|| postName.equalsIgnoreCase("Assistant") || postName.equalsIgnoreCase("Special Cadre Officer")) {
			return true;
		}
		return false;	
	}
	
	public boolean isValidAge(int age) {
		if(age>35 || age<18) {
			return false;
		}
		return true;
		
	}
	
	
}
