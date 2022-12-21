package RRTTechnical;

public abstract class RRTTechnicalCertification implements Certification {
	public static int counter=1000;
	private String StudentName;
	private String courseName;
	private int registrationId;
	private int admissionTestmarks;
	
	public RRTTechnicalCertification(String studentName, String courseName,
			int admissionTestmarks) {
		super();
		StudentName = studentName;
		this.courseName = courseName;
		this.admissionTestmarks = admissionTestmarks;
		this.registrationId=counter;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getRegistrationId() {
		return this.registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId =registrationId;
	}
	public int getAdmissionTestmarks() {
		return admissionTestmarks;
	}
	public void setAdmissionTestmarks(int admissionTestmarks) {
		this.admissionTestmarks = admissionTestmarks;
	}
	
	public abstract void generateRegistrationId();
	@Override
	public double calculateFee() {
		return 0;
	}
}
