import java.util.Scanner; //import library named Scanner
public class finalmarkcalc { 
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in); // Built in reader into library

    System.out.print("Enter the final mark: ");
        int mark = reader.nextInt();
        
         String grade;
        if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
            {
            System.out.println("The grade is: " + grade);
            }
    }
}
