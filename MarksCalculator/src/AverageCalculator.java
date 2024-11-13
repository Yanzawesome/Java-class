public class AverageCalculator {
    private int mark1;
    private int mark2;
    private int mark3;

    // Constructor to initialize marks
    public AverageCalculator(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate the average
    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}
