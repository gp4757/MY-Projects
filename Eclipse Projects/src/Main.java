import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String studentId;
		String major;
		int absentDays;
		int marks;
		
		//creating arraylist to store student information
		ArrayList<StudentInformation> myStudentList = new ArrayList<StudentInformation>();
		
		while(true) {
			//asking user for the information of the student
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student first Name");
			firstName = sc.nextLine();
			System.out.println("Enter Student last Name");
			lastName = sc.nextLine();
			System.out.println("Enter student Id");
			studentId = sc.nextLine();
			System.out.println("Enter Student major");
			major = sc.nextLine();
			System.out.println("Enter Student current masks out of 100");
			marks = sc.nextInt();
			System.out.println("Number of absent days");
			absentDays = sc.nextInt();
			
		
			//calling student information class using the given input information
			StudentInformation student = new StudentInformation(firstName,lastName,studentId,major,marks,absentDays);
			myStudentList.add(student);
			System.out.println("Do you want to store information of another student? Enter yes/no");
			String input = sc.next();
			if (input.equalsIgnoreCase("no")){
				break;
			}
			
			
			}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student id or enter all to check information of all student");
		String info = input.next();
		if (info.equalsIgnoreCase("all")) {
			System.out.println("The details information about the student are");
			for(StudentInformation s1: myStudentList) {
				
				System.out.println(s1);
				
			}
		}
		
		

	}

}
