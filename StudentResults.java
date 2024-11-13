import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] results = new int[numberOfStudents];
        int passCount = 0;
        int failCount = 0;

        // Getting the test results from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the result for student " + (i + 1) + " (1 for pass, 0 for fail): ");
            results[i] = input.nextInt();

            if (results[i] == 1) {
                passCount++;
            } else if (results[i] == 0) {
                failCount++;
            } else {
                System.out.println("Invalid input, please enter 1 for pass or 0 for fail.");
                i--; // Decrement the counter to allow re-entry of the correct value
            }
        }

        input.close();

        // Display the results
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);

        // Calculate if more than 50% passed
        if (passCount > numberOfStudents / 2) {
            System.out.println("Bonus to instructor!");
        }
    }
}
