package array_and_string_operation.arrays.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] employee = new double[10][2];
        double[][] result = new double[10][2];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            employee[i][0] = salary;
            employee[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double salary = employee[i][0];
            double years = employee[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Old Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
        }

        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}