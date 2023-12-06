package org.launchcode;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map; //import the map class when you use hashmaps always

public class LectureDec4 {

    public static void main(String[] args) {
//        Scanner input - new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = input.nextLine();
//
//        do {
//            System.out.println("Hello " + name + "!");
//            System.out.println();
//            name = input.nextLine();
//        } while (name.equals(""));

        ArrayList<String> favoriteAssignments = new ArrayList<>();
        favoriteAssignments.add("Mars Rover");
        favoriteAssignments.add("Candidate Testing");
        favoriteAssignments.add("Launch Checklist");


        ArrayList<String> coolNames = new ArrayList<>() {
            {
                add("Gerard Darris");
                add("Banana Cat");
                add("Apple Dog");
            }
        };
//        System.out.println(coolNames.get(1)); //this will reference the item at the index you want

//        for (String name : favoriteAssignments) {
//            System.out.println(name);
//        }
        ArrayList<ArrayList<String>> emberKu = new ArrayList<>();
        emberKu.add(favoriteAssignments);
        emberKu.add(coolNames);
//        System.out.println(emberKu);


//        for (int i = 0; i<emberKu.size(); i++) {
//            for (String item : emberKu.get(i)) {
//                System.out.println(item);
//            }
//        }
//        for (ArrayList<String> ember : emberKu) {
//            for (String item : ember) {
//                System.out.println(item);
//            }
//        }

    }
}
