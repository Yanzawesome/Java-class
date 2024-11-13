import java.util.Scanner;

public class GradeCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to hold the grades count
        int[] gradeCount = new int[5];

        // Get marks from the user
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter mark " + i + ": ");
            int mark = input.nextInt();
            char grade = calculateGrade(mark);
            updateGradeCount(grade, gradeCount);
        }

        input.close();

        // Display the result
        displayGradeCount(gradeCount);
    }

    // Method to calculate grade based on the mark
    public static char calculateGrade(int mark) {
        if (mark >= 80 && mark <= 100) {
            return 'A';
        } else if (mark >= 70 && mark < 80) {
            return 'B';
        } else if (mark >= 60 && mark < 70) {
            return 'C';
        } else if (mark >= 50 && mark < 60) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Method to update the grade count based on the grade
    public static void updateGradeCount(char grade, int[] gradeCount) {
        switch (grade) {
            case 'A':
                gradeCount[0]++;
                break;
            case 'B':
                gradeCount[1]++;
                break;
            case 'C':
                gradeCount[2]++;
                break;
            case 'D':
                gradeCount[3]++;
                break;
            case 'E':
                gradeCount[4]++;
                break;
        }
    }

    // Method to display the grade count
    public static void displayGradeCount(int[] gradeCount) {
        System.out.println("Out of 10:");
        System.out.println("Grade A: " + gradeCount[0]);
        System.out.println("Grade B: " + gradeCount[1]);
        System.out.println("Grade C: " + gradeCount[2]);
        System.out.println("Grade D: " + gradeCount[3]);
        System.out.println("Grade E: " + gradeCount[4]);
    }
}