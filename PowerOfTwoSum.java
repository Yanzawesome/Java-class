public class PowerOfTwoSum {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Power of 2 (n^2) for integers 1-10:");

        for (int i = 1; i <= 10; i++) {
            int power = i * i;  // Calculate n^2
            System.out.println(i + "^2 = " + power);
            sum += power;  // Add to sum
        }

        System.out.println("Sum of powers of 2 (n^2) from 1 to 10: " + sum);
    }
}
