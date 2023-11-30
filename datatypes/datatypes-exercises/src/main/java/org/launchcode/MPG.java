package org.launchcode;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven: ");
        Double numMiles = input.nextDouble();
        System.out.println("Number of gallons of gas used: ");
        Double numGallons = input.nextDouble();
        double MPG = numMiles/numGallons;
        System.out.println("Your gas mileage was " + MPG + " mpg.");
    }
}
