public class DisplaySequenceloop {
    public static void main(String[] args) {
        System.out.println("Sequence of numbers:");

        // Start from 99 and decrement by 11 each time
        for (int i = 99; i >= 11; i -= 11) {
            System.out.print(i + " ");
        }
    }
}
