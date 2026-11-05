package DSA_Practice;

import java.util.Scanner;

public class NumberDigitReversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}