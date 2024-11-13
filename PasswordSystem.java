import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        final String correctPassword = "firhanhensem"; // The correct password
        final int maxAttempts = 3; // Maximum number of allowed attempts
        int attempts = 0; // Counter for the number of attempts
        boolean accessGranted = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Password System.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your password: ");
            String inputPassword = input.nextLine();
            attempts++;

            if (inputPassword.equals(correctPassword)) {
                accessGranted = true;
                break;
            } else {
                System.out.println("Incorrect password. You have " + (maxAttempts - attempts) + " attempts left.");
            }
        }

        input.close();

        if (accessGranted) {
            System.out.println("Access Granted. Welcome!");
        } else {
            System.out.println("Access Denied. You have exceeded the maximum number of attempts.");
        }
    }
}
