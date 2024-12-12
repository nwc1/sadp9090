package com.company.employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Employee {
    private int eno;
    private String ename;
    private String designation;
    private String deptName;
    private double salary;

    // Constructor
    public Employee(int eno, String ename, String designation, String deptName, double salary) {
        this.eno = eno;
        this.ename = ename;
        this.designation = designation;
        this.deptName = deptName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee No: " + eno + ", Name: " + ename + ", Designation: " + designation +
               ", Department: " + deptName + ", Salary: " + salary;
    }
}

public class EmployeeService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many employees they want to enter
        System.out.print("Enter how many employees you want to register: ");
        int employeeCount = scanner.nextInt();

        // Loop to accept details for each employee
        try (FileWriter writer = new FileWriter("employee.txt", true)) {
            for (int i = 0; i < employeeCount; i++) {
                System.out.println("\nEnter details for Employee " + (i + 1) + ":");

                System.out.print("Enter Employee Number: ");
                int eno = scanner.nextInt();
                scanner.nextLine();  // Consume newline left-over

                System.out.print("Enter Employee Name: ");
                String ename = scanner.nextLine();

                System.out.print("Enter Designation: ");
                String designation = scanner.nextLine();

                System.out.print("Enter Department Name: ");
                String deptName = scanner.nextLine();

                System.out.print("Enter Salary (Without comma): ");
                double salary = scanner.nextDouble();

                // Creating Employee object
                Employee employee = new Employee(eno, ename, designation, deptName, salary);

                // Write employee details to the file
                writer.write(employee.toString() + "\n");
            }

            System.out.println("Employee details saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
