package array_and_string_operation.strings.level2;

import java.util.Scanner;

public class WordLength2D {

    static String[] splitWords(String text) {
        String[] temp = new String[text.length() + 1];

        int count = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else if (!word.isEmpty()) {
                temp[count] = word;
                count++;
                word = "";
            }
        }

        if (!word.isEmpty()) {
            temp[count] = word;
            count++;
        }

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = temp[i];
        }

        return words;
    }

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

    static String[][] getWordLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];

            int length = findLength(words[i]);

            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = getWordLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }

        sc.close();
    }
}