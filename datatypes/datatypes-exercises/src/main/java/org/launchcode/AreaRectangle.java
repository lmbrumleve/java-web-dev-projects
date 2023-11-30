package org.launchcode;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle length: ");
        int length = input.nextInt();
        System.out.println("Rectangle width: ");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
