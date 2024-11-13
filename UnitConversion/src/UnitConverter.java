public class UnitConverter {

    // Temperature Conversion
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Distance Conversion (Kilometers to Miles)
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    // Weight Conversion (Kilograms to Pounds)
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}