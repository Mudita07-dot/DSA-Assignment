package array_and_string_operation.strings.level1;

import java.util.Scanner;

public class StringToCharArray {

    static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = getCharacters(text);
        char[] arr2 = text.toCharArray();

        System.out.println("User defined array: " +
                new String(arr1));

        System.out.println("Built-in array: " +
                new String(arr2));

        System.out.println("Both arrays are same: " +
                compareArrays(arr1, arr2));

        sc.close();
    }
}