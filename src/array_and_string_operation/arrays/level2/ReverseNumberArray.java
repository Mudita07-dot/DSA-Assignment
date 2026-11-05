package array_and_string_operation.arrays.level2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long num = Math.abs((long) number);

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

        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed Number: ");

        if (number < 0) {
            System.out.print("-");
        }

        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }

        sc.close();
    }
}