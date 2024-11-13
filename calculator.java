import java.util.Scanner;

public class calculator {

    public static void main (String[]args) {
       
        int n1 = -5 + 8 * 6;
        int n2 = (55 + 9) % 9;
        int n3 = 20 + -3 * 5 / 8;
        int n4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.print("Here are some Calculations\n ");
        System.out.println("-5 + 8 * 6            :" +n1);
        System.out.println("(55 + 9) % 9           :" +n2);
        System.out.println("20 + -3 * 5 / 8        :" +n3);
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 :" +n4);
        
        }
    }