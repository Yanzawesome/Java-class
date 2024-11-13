import java.util.Scanner;

public class FIRHANConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Converters available:");
        System.out.println("1. Currency (MYR to YEN)");
        System.out.println("2. Mass (kg to pound)");
        System.out.println("3. Distance (km to m)");
        
        System.out.print("Choose your converter (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Insert Amount/Quantity: ");
        double inputValue = scanner.nextDouble();
        double convertedValue = 0;

        switch (choice) {
            case 1:
                // Currency conversion: MYR to YEN (example rate: 1 MYR = 30.5 YEN)
                convertedValue = inputValue * 30.5;
                System.out.println(inputValue + " MYR =1 " + convertedValue + " YEN");
                break;
            case 2:
                // Mass conversion: kg to pound (1 kg = 2.20462 pounds)
                convertedValue = inputValue * 2.20462;
                System.out.println(inputValue + " kg = " + convertedValue + " pounds");
                break;
            case 3:
                // Distance conversion: km to m (1 km = 1000 meters)
                convertedValue = inputValue * 1000;
                System.out.println(inputValue + " km = " + convertedValue + " meters");
                break;
            
            default:
                System.out.println("Invalid choice! Please select a valid converter.");
        }

        scanner.close();
    }
}
