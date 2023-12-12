package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        ArrayList <MenuItem> IndonesianFood = new ArrayList<>();

        MenuItem nasiGoreng = new MenuItem(4.00, "Indonesian Fried Rice", "Main Course", false, date);
        MenuItem sateAyam = new MenuItem(4.00, "Indonesian Chicken Satay", "Main Course", false, date);
        MenuItem oporAyam = new MenuItem(4.00, "Chicken and Cocount Curry", "Main Course", false, date);
        MenuItem martabak = new MenuItem(4.00, "Martabak", "Dessert", true, date);
        MenuItem tahuIsi = new MenuItem(4.00, "Stuffed Tofu", "Appetizer", true, date);

        IndonesianFood.add(nasiGoreng);
        IndonesianFood.add(sateAyam);
        IndonesianFood.add(oporAyam);
        IndonesianFood.add(martabak);
        IndonesianFood.add(tahuIsi);

        Menu indonesianFoodMenu = new Menu(date, IndonesianFood);
//        System.out.println(indonesianFoodMenu.getItem().get(1).isNewItem());
// Add a menu item:
//        indonesianFoodMenu.addMenuItem(nasiGoreng);
// Remove a menu item:
//        indonesianFoodMenu.removeMenuItem(nasiGoreng);
// Check if an item is new:
//        System.out.println(nasiGoreng.isNewItem());
// Print a menu item to the console:
nasiGoreng.printMenuItem();
// Print the menu to the console:
//        indonesianFoodMenu.printMenu();
// Compare menu items:
        nasiGoreng.compare(oporAyam);
}}
