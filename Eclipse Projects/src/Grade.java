
public class Grade {
	
	public static String LetterGrade(int marks) {
		
		if (marks >= 90) {
			return "A";
			}
		else if(marks < 90 && marks >=80) {
			return "B";
			
		}
		else if(marks < 80 && marks >=70) {
			return "C";
			
		}
		else if(marks < 70 && marks >=60) {
			return "D";
			
		}
		else if(marks < 60) {
			return "F";
			
		}
		else {
			return "Not Applicable";
		}
	}
		
	

}
