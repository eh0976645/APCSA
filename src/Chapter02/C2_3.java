package Chapter02;

import java.util.Scanner;

/**
 * Program to get information from the user
 *
 * @author Ethan Holland
 */
public class C2_3 {

    /**
     * Main Method
     *
     * @param args command line argument
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double gallons = distance / milesPerGallon;
        double costOfDriving = pricePerGallon * gallons;

        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
