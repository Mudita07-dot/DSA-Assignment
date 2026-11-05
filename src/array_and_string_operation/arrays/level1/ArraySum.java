package array_and_string_operation.arrays.level1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];

        double total = 0.0;
        int index = 0;

        while (true) {

            System.out.println("Enter a number:");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            arr[index] = num;
            index++;
        }

        System.out.println("Entered numbers:");

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total = total + arr[i];
        }

        System.out.println("Total Sum: " + total);

        sc.close();
    }
}