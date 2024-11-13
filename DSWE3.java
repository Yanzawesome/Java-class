import java.util.Scanner;

public class DSWE3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input your first name: "); 
        String fname = input.nextLine();

        System.out.print("Input your last name: "); 
        String lname = input.nextLine();
        
        System.out.println("\nHello"); 

        System.out.println( fname + " " + lname);
        
        input.close();
    }
}
