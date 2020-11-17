//This class store detail information about the student.

public class StudentInformation {
	String firstName;
	String lastName;
	String studentId;
	String major;
	int absentDays;
	int marks;
	
	
	public StudentInformation(String firstName, String lastName, String studentId, String major,int marks, int absentDays) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.major = major;
		this.absentDays = absentDays;
		this.marks = marks; 
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		
		
		return "\n firstName=" + firstName + "\n lastName=" + lastName + "\n studentId=" + studentId
				+ "\n major=" + major 
						+ "\nGrade  is " + Grade.LetterGrade(marks)
						+ "\n Number of absent Days=" + absentDays
						+ "\n\n";
	}

	
		
}
   

