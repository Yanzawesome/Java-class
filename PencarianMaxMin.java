import java.util.Scanner;

public class PencarianMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continueInput;

        do {
            // Input 3 integers
            System.out.print("Enter the first integer: ");
            int num1 = input.nextInt();
            
            System.out.print("Enter the second integer: ");
            int num2 = input.nextInt();
            
            System.out.print("Enter the third integer: ");
            int num3 = input.nextInt();

            // Find the maximum and minimum values
            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));

            // Display the maximum and minimum values
            System.out.println("The maximum value is: " + max);
            System.out.println("The minimum value is: " + min);

            // Ask if the user wants to input another set of numbers
            System.out.print("Do you want to input another set of numbers? (Y/N): ");
            continueInput = input.next().charAt(0);

        } while (Character.toUpperCase(continueInput) == 'Y');

        input.close();
        System.out.println("Program ended.");
    }
}
