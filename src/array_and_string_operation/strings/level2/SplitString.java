package array_and_string_operation.strings.level2;

import java.util.Scanner;

public class SplitString {

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 0;

        boolean insideWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !insideWord) {
                wordCount++;
                insideWord = true;
            } else if (text.charAt(i) == ' ') {
                insideWord = false;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else if (!word.isEmpty()) {
                words[index] = word;
                index++;
                word = "";
            }
        }

        if (!word.isEmpty()) {
            words[index] = word;
        }

        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] result1 = splitWords(text);
        String[] result2 = text.trim().isEmpty()
                ? new String[0] : text.trim().split("\\s+");

        System.out.println("\nUser defined words:");

        for (String word : result1) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in words:");

        for (String word : result2) {
            System.out.println(word);
        }

        System.out.println("\nBoth results are same: " +
                compare(result1, result2));

        sc.close();
    }
}