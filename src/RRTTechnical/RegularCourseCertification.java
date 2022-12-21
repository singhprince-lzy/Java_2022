package RRTTechnical;

public class RegularCourseCertification extends RRTTechnicalCertification {
	private int courseDuration;
	

	public RegularCourseCertification(String studentName,String courseName,int admissionTestmarks,int courseDuration) {
		super(studentName,courseName,admissionTestmarks);
		this.courseDuration = courseDuration;
		generateRegistrationId();
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	public double calculateFee() {
		double tot=0;
		if(super.getAdmissionTestmarks()>=90) {
			tot=courseDuration*super.REGULAR_COURSE_FEE;
			tot-=tot*0.1;
		}
		else if(super.getAdmissionTestmarks()>75 && super.getAdmissionTestmarks()<89) {
			tot=courseDuration*super.REGULAR_COURSE_FEE;
			tot-=tot*0.05;
		}
		else {
			tot=courseDuration*super.REGULAR_COURSE_FEE;
		}
		//tot+=(tot*309/25);
		return tot;
		
	}
	
	public void generateRegistrationId() {
		if (RRTTechnicalCertification.counter%2==0) {
			RRTTechnicalCertification.counter+=1;
			super.setRegistrationId(RRTTechnicalCertification.counter);
		}else {
			RRTTechnicalCertification.counter+=2;
			super.setRegistrationId(RRTTechnicalCertification.counter);
		}
	}
}
