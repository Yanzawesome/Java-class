import java.util.Scanner;

public class Firhans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        UnitConverter myunitconverter = new UnitConverter(); // Declare object for UnitConverter

        while (continueConversion) {
            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Temperature (Celsius -> Fahrenheit / Fahrenheit -> Celsius)");
            System.out.println("2. Distance (Kilometers -> Miles / Miles -> Kilometers)");
            System.out.println("3. Weight (Kilograms -> Pounds / Pounds -> Kilograms)");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius: ");
                    int tempChoice = scanner.nextInt();
                    if (tempChoice == 1) {
                        System.out.print("Enter temperature in Celsius: ");
                        double celsius = scanner.nextDouble();
                        double fahrenheit = myunitconverter.celsiusToFahrenheit(celsius); // Use the object here
                        System.out.println(celsius + "°C is " + fahrenheit + "°F");
                    } else {
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        double celsius = myunitconverter.fahrenheitToCelsius(fahrenheit); // Use the object here
                        System.out.println(fahrenheit + "°F is " + celsius + "°C");
                    }
                    break;

                case 2:
                    System.out.print("Enter 1 for Kilometers to Miles or 2 for Miles to Kilometers: ");
                    int distanceChoice = scanner.nextInt();
                    if (distanceChoice == 1) {
                        System.out.print("Enter distance in Kilometers: ");
                        double kilometers = scanner.nextDouble();
                        double miles = myunitconverter.kilometersToMiles(kilometers); // Use the object here
                        System.out.println(kilometers + " km is " + miles + " miles");
                    } else {
                        System.out.print("Enter distance in Miles: ");
                        double miles = scanner.nextDouble();
                        double kilometers = myunitconverter.milesToKilometers(miles); // Use the object here
                        System.out.println(miles + " miles is " + kilometers + " km");
                    }
                    break;

                case 3:
                    System.out.print("Enter 1 for Kilograms to Pounds or 2 for Pounds to Kilograms: ");
                    int weightChoice = scanner.nextInt();
                    if (weightChoice == 1) {
                        System.out.print("Enter weight in Kilograms: ");
                        double kilograms = scanner.nextDouble();
                        double pounds = myunitconverter.kilogramsToPounds(kilograms); // Use the object here
                        System.out.println(kilograms + " kg is " + pounds + " lbs");
                    } else {
                        System.out.print("Enter weight in Pounds: ");
                        double pounds = scanner.nextDouble();
                        double kilograms = myunitconverter.poundsToKilograms(pounds); // Use the object here
                        System.out.println(pounds + " lbs is " + kilograms + " kg");
                    }
                    break;

                case 4:
                    continueConversion = false;
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
}
