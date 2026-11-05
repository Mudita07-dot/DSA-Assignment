package array_and_string_operation.arrays.level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            int p = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            int c = sc.nextInt();

            System.out.print("Enter Maths marks: ");
            int m = sc.nextInt();

            if (p < 0 || p > 100 ||
                    c < 0 || c > 100 ||
                    m < 0 || m > 100) {

                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentage[i] = (p + c + m) / 3.0;

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
                    physics[i] + "\t" +
                            chemistry[i] + "\t\t" +
                            maths[i] + "\t" +
                            percentage[i] + "\t\t" +
                            grade[i]
            );
        }

        sc.close();
    }
}