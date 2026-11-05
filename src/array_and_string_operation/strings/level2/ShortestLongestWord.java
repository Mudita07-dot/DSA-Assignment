package array_and_string_operation.strings.level2;

import java.util.Scanner;

public class ShortestLongestWord {

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
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    static int[] findShortestLongest(String[][] data) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);

            int shortestLength = Integer.parseInt(data[shortest][1]);
            int longestLength = Integer.parseInt(data[longest][1]);

            if (currentLength < shortestLength) {
                shortest = i;
            }

            if (currentLength > longestLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        if (words.length == 0) {
            System.out.println("No words found.");
            sc.close();
            return;
        }

        String[][] data = getWordLength(words);

        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word: " +
                data[result[0]][0]);

        System.out.println("Longest Word: " +
                data[result[1]][0]);

        sc.close();
    }
}