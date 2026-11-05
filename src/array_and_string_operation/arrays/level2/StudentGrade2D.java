package array_and_string_operation.arrays.level2;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];

        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {

                if (j == 0) {
                    System.out.print("Enter Physics marks: ");
                } else if (j == 1) {
                    System.out.print("Enter Chemistry marks: ");
                } else {
                    System.out.print("Enter Maths marks: ");
                }

                int value = sc.nextInt();

                if (value < 0 || value > 100) {
                    System.out.println("Invalid marks. Enter again.");
                    j--;
                    continue;
                }

                marks[i][j] = value;
            }

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 80) {
                grade[i] = "B";
            } else if (percentage[i] >= 70) {
                grade[i] = "C";
            } else if (percentage[i] >= 60) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            percentage[i] + "\t\t" +
                            grade[i]
            );
        }

        sc.close();
    }
}