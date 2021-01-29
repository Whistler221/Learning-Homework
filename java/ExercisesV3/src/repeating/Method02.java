package repeating;

public class Method02 {
	
	public static void main(String[] args) {
		
		System.out.print("The grade is: ");
		printGrade(78.5);
		
		System.out.print("The grade is: ");
		printGrade(59.5);
	}
	
	public static void printGrade(double score) {
		if (score < 0 || score > 100) {
			System.out.println("Invalid score");
			return;
		}
		if (score >= 90.0) {
			System.out.println('A');
		}
		else if (score >= 80.0) {
			System.out.println('B');
		}
		else if (score >= 70.0) {
			System.out.println('C');
		}
		else if (score >= 60.0) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
	}

	public static void main2(String[] args) {
		System.out.print("The grade is: " + getGrade(78.5));
		System.out.print("The grade is: " + getGrade( 59.5));
	}
	
		public static char getGrade(double score) {
			if (score >= 90.0) {
				return ('A');
			}
			else if (score >= 80.0) {
				return ('B');
			}
			else if (score >= 70.0) {
				return ('C');
			}
			else if (score >= 60.0) {
				return ('D');
			}
			else {
				return ('F');
			}
		}
}