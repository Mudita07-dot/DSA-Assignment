package array_and_string_operation.strings.level1;

import java.util.Scanner;

public class CompareStrings {

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

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean result1 = compare(s1, s2);
        boolean result2 = s1.equals(s2);

        System.out.println("User defined result: " + result1);
        System.out.println("Built-in result: " + result2);

        System.out.println("Both results are same: " +
                (result1 == result2));

        sc.close();
    }
}