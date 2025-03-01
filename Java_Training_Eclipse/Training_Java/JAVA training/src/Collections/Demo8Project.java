package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
// Employee Class
class Employee {
    int id, age, salary;
    String name, designation;
    // Constructor
    Employee(int id, String name, int age, int salary, String designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }
 
    // Display Employee Details
    void display() {
        System.out.println("==============================");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("==============================");
    }
}
 
// Main Class
public class Demo8Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer, Employee> empMap = new HashMap<>(); // Employee storage
        int choice;
 
        do {
            System.out.println("\n==============================");
            System.out.println("1) Create Employee");
            System.out.println("2) Display Employees");
            System.out.println("3) Update Employee");
            System.out.println("4) Delete Employee");
            System.out.println("5) Exit");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
 
            switch (choice)
            {
                case 1: // CREATE Employee
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    if (empMap.containsKey(id)) {
                        System.out.println("Employee ID already exists! Try again.");
                        break;
                    }
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Designation (Clerk/Developer): ");
                    String designation = sc.next();
                    int salary = designation.equalsIgnoreCase("Clerk") ? 30000 : 50000;
 
                    empMap.put(id, new Employee(id, name, age, salary, designation));
                    System.out.println("Employee added successfully!");
                    break;
 
                case 2: // DISPLAY Employees
                    if (empMap.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
                            entry.getValue().display();
                        }
                    }
                    break;
 
                case 3: // UPDATE Employee
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    if (empMap.containsKey(updateId)) {
                        Employee emp = empMap.get(updateId);
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter New Name: ");
                        emp.name = sc.nextLine();
                        System.out.print("Enter New Age: ");
                        emp.age = sc.nextInt();
                        System.out.println("Employee updated successfully!");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;
 
                case 4: // DELETE Employee
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    if (empMap.remove(deleteId) != null) {
                        System.out.println("Employee deleted successfully.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;
 
                case 5: // EXIT
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
 
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }
}