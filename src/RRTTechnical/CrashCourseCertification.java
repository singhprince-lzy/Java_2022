package RRTTechnical;

public class CrashCourseCertification extends RRTTechnicalCertification {

	public CrashCourseCertification(String studentName, String courseName, int admissionTestmarks) {
		super(studentName, courseName, admissionTestmarks);
		generateRegistrationId();
	}
	
	public void generateRegistrationId() {
		if (RRTTechnicalCertification.counter%2==0) {
			RRTTechnicalCertification.counter+=2;
			super.setRegistrationId(RRTTechnicalCertification.counter);
		}else {
			RRTTechnicalCertification.counter+=1;
			super.setRegistrationId(RRTTechnicalCertification.counter);
		}
	}
	
	public double calculateFee() {
		double tot=0;
		if(super.getAdmissionTestmarks()>=90) {
			tot=super.CRASH_COURSE_FEE;
			tot-=tot*0.1;
		}
		else if(super.getAdmissionTestmarks()>75 && super.getAdmissionTestmarks()<89) {
			tot=super.CRASH_COURSE_FEE;
			tot-=tot*0.05;
		}
		else {
			tot=super.CRASH_COURSE_FEE;
		}
		tot+=(tot*0.1236);
		return tot;
	}

}
