public class SumEvenOdd {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Even numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenSum += i;
            }
        }

        System.out.println("\nSum of even numbers: " + evenSum);

        System.out.println("\nOdd numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                oddSum += i;
            }
        }

        System.out.println("\nSum of odd numbers: " + oddSum);
    }
}
