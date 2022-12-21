package RRTTechnical;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularCourseCertification r= new RegularCourseCertification("Rakesh", "J2EE", 85,5);
		CrashCourseCertification c= new CrashCourseCertification("Roshan", "Angular", 71);
		CrashCourseCertification c1= new CrashCourseCertification("Roshan", "Angular", 71);
		RegularCourseCertification r1= new RegularCourseCertification("Rakesh", "J2EE", 85,5);
		
		
		RRTTechnicalCertification t= (RRTTechnicalCertification)r;
		System.out.println("*********Regular Course Fee**********");
		System.out.println("Student name "+r.getStudentName());
		System.out.println("Course name "+r.getCourseName());
		System.out.println("Marks "+r.getAdmissionTestmarks());
		System.out.println("Id "+r.getRegistrationId());
		System.out.println("Fees is: "+ r.calculateFee());
		
		System.out.println("*********Creah Course Fee**********");
		System.out.println("Student name "+c.getStudentName());
		System.out.println("Course name "+c.getCourseName());
		System.out.println("Marks "+c.getAdmissionTestmarks());
		System.out.println("Id "+c.getRegistrationId());
		System.out.println("Fees is: "+ c.calculateFee());

	}

}
