package org.launchcode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Area {
    public static void main(String[] args) {
        //Regular Assignment Section
//        double radius;
//        double area;
//
//        Scanner input;
//        input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//        radius = input.nextDouble();
//        input.close();
//
////      area = 3.14*radius*radius;
//        area = Circle.getArea(radius);
//        System.out.println("The area of a circle with a radius " + radius + " is " + area);
        //BONUS SECTION
        Boolean validInput = false;
        while (!validInput) {
            String userInput;
            Pattern pattern = Pattern.compile(".*[^0-9].*");

            Scanner input;
            input = new Scanner(System.in);
            System.out.println("Enter a radius: ");
            userInput = input.nextLine();
            userInput = userInput.toLowerCase();

            if (userInput.isEmpty()) {
                System.out.println("Invalid input.");
            } else if (pattern.matcher(userInput).matches()) {
                System.out.println("Invalid input.");
            } else {
                Double convertedInput = Double.parseDouble(userInput);
                if (convertedInput <= 0) {
                    System.out.println("Invalid input.");
                } else {
                    System.out.println("The area of a circle with a radius " + userInput + " is " + Circle.getArea(convertedInput));
                    validInput = true;
                }
            }
        }
    }

}
