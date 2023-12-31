package org.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

//        for (Flavor flavor : flavors) {
//            System.out.println(flavor.getName());
//        }
//
//        for (Cone cone : cones) {
//            System.out.println(cone.getCost());
//        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
//        System.out.println("Flavors (sorted alphabetically): ");
//        for (Flavor flavor : flavors) {
//            System.out.println(flavor.getName());
//        }
//        System.out.println(" \n ");

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator comparator1 = new ConeComparator();
        cones.sort(comparator1);
        System.out.println("Cones (sorted by price): ");
        for (Cone cone : cones) {
            System.out.format("$" + "%, .2f" + "\n", cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        //BONUS:
        flavors.sort(comparator);
        for (int i = 0; i < 3; i++) {
            System.out.println("\nFlavors with " + (i+1) + " allergen(s): ");
            for (Flavor flavor : flavors) {
                if (flavor.getAllergens().size() == i + 1) {
                    System.out.println(flavor.getName());
                }
            }
//
//            System.out.println("\nFlavors with 1 allergen: ");
//            for (Flavor flavor : flavors) {
//                if (flavor.getAllergens().size() == 1) {
//                    System.out.println(flavor.getName());
//                }
//            }
//            System.out.println("\nFlavors with 2 allergens: ");
//            for (Flavor flavor : flavors) {
//                if (flavor.getAllergens().size() == 2) {
//                    System.out.println(flavor.getName());
//                }
//            }
//            System.out.println("\nFlavors with 3 allergens: ");
//            for (Flavor flavor : flavors) {
//                if (flavor.getAllergens().size() == 3) {
//                    System.out.println(flavor.getName());
//                }
//            }


        }
        Comparator comparator2 = new ToppingComparator();
        toppings.sort(comparator2);
        System.out.println("\nToppings (sorted alphabetically): ");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }
    }
}