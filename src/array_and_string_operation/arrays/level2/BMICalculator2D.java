package array_and_string_operation.arrays.level2;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Enter positive values.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);

            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.println(
                    personData[i][1] + "\t" +
                            personData[i][0] + "\t" +
                            personData[i][2] + "\t" +
                            weightStatus[i]
            );
        }

        sc.close();
    }
}