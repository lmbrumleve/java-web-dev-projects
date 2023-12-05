package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String quote;
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        System.out.println("What is your quest?");
        quote = input.nextLine();

        HashMap<String, Integer> characterMap = new HashMap<>();

        quote = quote.toLowerCase();
        quote = quote.replaceAll("[^a-zA-Z]", "");
        System.out.println(quote);

        char[] charactersInString = quote.toCharArray();
        System.out.println(charactersInString);

        for (char i : charactersInString) {
        characterMap.put(Character.toString(i), 0);
        }
        System.out.println(characterMap);

        for (Map.Entry<String, Integer> keyValuePair : characterMap.entrySet()) {
        for (char j : charactersInString) {
            String letter = Character.toString(j);

            if (letter.equals(keyValuePair.getKey())) {
                int total = keyValuePair.getValue();
                total++;
                characterMap.put(letter, total);
                System.out.println(characterMap);
            }
            }
        }
    }
}