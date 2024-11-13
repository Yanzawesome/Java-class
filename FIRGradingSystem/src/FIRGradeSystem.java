import javax.swing.JOptionPane; //import library name JOptionPane
import java.util.Scanner; // import library name Scanner

public class FIRGradeSystem { // main class

    public static void main(String[] args) { // method main
        Scanner input = new Scanner(System.in); // Console input for continuation choice
        char choice; // do while loop

        do { // do while loop
             // Using JOptionPane to input number of students
            String numStudentsStr = JOptionPane.showInputDialog(null, "Enter the number of students:");
            int numStudents = Integer.parseInt(numStudentsStr); // string to int
            int[] marks = new int[numStudents]; // array is created to store students grade

            // Grade counters
            int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
            int pass = 0, fail = 0;

            // Input marks and assign grades using JOptionPane for each student
            for (int i = 0; i < numStudents; i++) { // loop for
                String markStr = JOptionPane.showInputDialog(null, "Enter mark for student " + (i + 1) + ":");
                marks[i] = Integer.parseInt(markStr);

                // Grade assignment
                if (marks[i] >= 80) { // check student marks and assign grade
                    gradeA++;
                    pass++;
                } else if (marks[i] >= 70) {
                    gradeB++;
                    pass++;
                } else if (marks[i] >= 60) {
                    gradeC++;
                    pass++;
                } else if (marks[i] >= 50) {
                    gradeD++;
                    pass++;
                } else {
                    gradeF++;
                    fail++;
                }
            }

            // Build grades summary
            String gradesSummary = String.format( // summary off all grades and number of student passed or failed
                    "Grades Summary:\nGrade A: %d\nGrade B: %d\nGrade C: %d\nGrade D: %d\nGrade F: %d\n\n" +
                            "Number of students passed: %d\nNumber of students failed: %d\n",
                    gradeA, gradeB, gradeC, gradeD, gradeF, pass, fail);

            // Display grades summary using JOptionPane
            JOptionPane.showMessageDialog(null, gradesSummary);

            // Check the result if more students passed or failed
            if (pass > fail) { // if else statemnent
                JOptionPane.showMessageDialog(null, "Bonus to instructor !! ");
            } else {
                JOptionPane.showMessageDialog(null, "More failed than passed :(");
            }

            // Ask the user if they want to continue using the console
            System.out.print("Do you want to continue? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Final message before exiting using JOptionPane
        JOptionPane.showMessageDialog(null, "Program exited, Thank you!.");
        input.close(); // scanner object is closed
    }
}
