package array_and_string_operation.strings.level2;

import java.util.Scanner;

public class StringLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int result = findLength(text);

        System.out.println("User defined length: " + result);
        System.out.println("Built-in length: " + text.length());

        sc.close();
    }
}