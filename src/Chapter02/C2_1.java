package Chapter02;

import java.util.Scanner;

/**
 * Program to use Scanner to save variables
 *
 * @author Ethan Holland
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args command line argument
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t:");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double accelaration = (v1 - v0) / t;
        System.out.println("The average accelaration is " + accelaration);
    }
}
