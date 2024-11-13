import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scanner utk markah student
        System.out.println("Insert marks for Budak 1 (three subjects):");
        int student1marks1 = scanner.nextInt();
        int student1marks2 = scanner.nextInt();
        int student1marks3 = scanner.nextInt();

        System.out.println("Insert marks for Budak 2 (three subjects):");
        int student2marks1 = scanner.nextInt();
        int student2marks2 = scanner.nextInt();
        int student2marks3 = scanner.nextInt();

        System.out.println("Insert marks for Budak 3 (three subjects):");
        int student3marks1 = scanner.nextInt();
        int student3marks2 = scanner.nextInt();
        int student3marks3 = scanner.nextInt();

        // Create objects baru utk averagecalculator
        AverageCalculator student1 = new AverageCalculator(student1marks1, student1marks2, student1marks3);
        AverageCalculator student2 = new AverageCalculator(student2marks1, student2marks2, student2marks3);
        AverageCalculator student3 = new AverageCalculator(student3marks1, student3marks2, student3marks3);

        // Calculate averages
        double average1 = student1.calculateAverage();
        double average2 = student2.calculateAverage();
        double average3 = student3.calculateAverage();

        // Display averages
        System.out.println("Average marks of Student 1: " + average1);
        System.out.println("Average marks of Student 2: " + average2);
        System.out.println("Average marks of Student 3: " + average3);

        // Calculate the highest average using Math.max
        double highestAverage = Math.max(average1, Math.max(average2, average3));
        System.out.println("The highest average is: " + highestAverage);

        scanner.close();
    }
}
