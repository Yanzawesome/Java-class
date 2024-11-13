import java.util.Scanner;

public class PencarianMaxMin {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continueInput;

        do {
            // Get the three integers from the user
            int[] numbers = getInputNumbers(input);

            // Find the maximum and minimum values
            int max = findMax(numbers);
            int min = findMin(numbers);

            // Display the maximum and minimum values
            displayResults(max, min);

            // Ask if the user wants to input another set of numbers
            continueInput = promptContinue(input);

        } while (Character.toUpperCase(continueInput) == 'Y');

        input.close();
        System.out.println("Program ended.");
    }

    // Method to get input from the user
    public static int[] getInputNumbers(Scanner input) {
        int[] numbers = new int[3];

        System.out.print("Enter the first integer: ");
        numbers[0] = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        numbers[1] = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        numbers[2] = input.nextInt();

        return numbers;
    }

    // Method to find the maximum value
    public static int findMax(int[] numbers) {
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }

    // Method to find the minimum value
    public static int findMin(int[] numbers) {
        return Math.min(numbers[0], Math.min(numbers[1], numbers[2]));
    }

    // Method to display the results
    public static void displayResults(int max, int min) {
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }

    // Method to prompt the user if they want to continue
    public static char promptContinue(Scanner input) {
        System.out.print("Do you want to input another set of numbers? (Y/N): ");
        return input.next().charAt(0);
    }
}
