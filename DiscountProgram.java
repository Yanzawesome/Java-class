import java.util.Scanner;

public class DiscountProgram {

    public static void main(String[] args) {
        Scanner discount = new Scanner(System.in);
        
        // Input item details
        System.out.print("Enter the item name: ");
        String itemName = discount.nextLine();
        
        System.out.print("Enter the price per item: "); // display instruction
        double pricePerItem = discount.nextDouble(); // double for point numbber
        
        System.out.print("Enter the quantity: ");
        int quantity = discount.nextInt(); // quantity = variables

        // Display discount options
        System.out.println("Choose the discount rate by selecting a color code:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Green (20%)");
        System.out.println("3. Blue (30%)");
        System.out.println("4. Yellow (40%)");

        int colorChoice = discount.nextInt();
        double discountRate = 0;

        // Determine the discount rate based on user choice
        switch (colorChoice) {
            case 1:
                discountRate = 0.10;
                break;
            case 2:
                discountRate = 0.20;
                break;
            case 3:
                discountRate = 0.30;
                break;
            case 4:
                discountRate = 0.40;
                break;
            default:
                System.out.println("Invalid choice. No discount will be applied.");
        }

        // Calculate total price, discount amount, and price after discount
        double totalPrice = pricePerItem * quantity;
        double discountAmount = totalPrice * discountRate;
        double priceAfterDiscount = totalPrice - discountAmount;

        // Display the results
        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: $" + pricePerItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Price after Discount: $" + priceAfterDiscount);
        
        discount.close();
    }
}
