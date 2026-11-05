package array_and_string_operation.arrays.level1;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive number");
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];

        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                if (index == maxFactor) {

                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors are:");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}