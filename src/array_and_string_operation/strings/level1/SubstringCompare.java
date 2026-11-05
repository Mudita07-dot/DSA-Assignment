package array_and_string_operation.strings.level1;

import java.util.Scanner;

public class SubstringCompare {

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start < 0 || end > text.length() ||
                start > end) {
            System.out.println("Invalid index");
        } else {
            String result1 = createSubstring(text, start, end);
            String result2 = text.substring(start, end);

            System.out.println("User defined substring: " + result1);
            System.out.println("Built-in substring: " + result2);

            System.out.println("Both are same: " +
                    compare(result1, result2));
        }

        sc.close();
    }
}