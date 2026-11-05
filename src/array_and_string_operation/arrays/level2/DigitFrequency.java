package array_and_string_operation.arrays.level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long num = Math.abs(number);

        int count = 0;
        long temp = num;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }

        int[] digits = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = (int) (num % 10);
            num = num / 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit\tFrequency");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        sc.close();
    }
}