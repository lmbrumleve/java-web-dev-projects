import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 5, 8};
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i : arr) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        String foxInSocks = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] words = foxInSocks.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = foxInSocks.split("\\.");
        System.out.println(Arrays.toString(sentences));
        System.out.println();

        ArrayList<Integer> nomor = new ArrayList<>();

        nomor.add(1);
        nomor.add(2);
        nomor.add(3);
        nomor.add(4);
        nomor.add(5);
        nomor.add(6);
        nomor.add(7);
        nomor.add(8);
        nomor.add(9);
        nomor.add(10);

        System.out.println(nomor);
        int sum = List.sumEven(nomor);
        System.out.println(sum);

        ArrayList <String> warna = new ArrayList<>();

        warna.add("hijau");
        warna.add("merah");
        warna.add("putih");
        warna.add("hitam");
        warna.add("kuning");
        warna.add("unggu");
        warna.add("biru");

        List.fiveLetters(warna);

    }
}
