package array_and_string_operation.arrays.level2;

import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int youngest = 0;
        int tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }

            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        System.out.println("\nYoungest Friend: " + names[youngest]);
        System.out.println("Age: " + age[youngest]);

        System.out.println("\nTallest Friend: " + names[tallest]);
        System.out.println("Height: " + height[tallest]);

        sc.close();
    }
}