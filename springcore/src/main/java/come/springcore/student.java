package come.springcore;

public class student {
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}


	private int studentId;
	private String studentName;
	private String studentAddress;

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id");
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		System.out.println("Setting student name");
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting student Address");
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
