
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class List {


    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int number : arr) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static void fiveLetters(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of letters: ");
        int penomoran = input.nextInt();

        for (String word : words) {
            if (word.length() == penomoran) {
                System.out.println(word);
            }
        }
    }
}

