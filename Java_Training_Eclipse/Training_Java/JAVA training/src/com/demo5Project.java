package com;
import java.util.Scanner;

interface Employee
{
    void raisesalary();
    void display();
}

abstract class Emp implements Employee {
    int id;
    int age;
    String name;
    String designation = "Trainee";
    int salary = 20000;
    
    Emp() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = s1.nextLine();
        System.out.print("Enter ID: ");
        id = s1.nextInt();
        s1.nextLine();
        System.out.print("Enter Age: ");
        age = s1.nextInt();
        s1.nextLine();
    }
}

class Developer extends Emp {
    Developer() {}
    
    public void display() {
        System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My Salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
    }
    
    public void raisesalary() {
        salary += 40000;
        System.out.println("Salary raised! New salary: " + salary);
    }
}

class Tester extends Emp {
    Tester() {}
    
    public void display() {
        System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My Salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
    }
    
    public void raisesalary() {
        salary += 20000;
        System.out.println("Salary raised! New salary: " + salary);
    }
}

class Clerk extends Emp {
    Clerk() {}
    
    public void display() {
        System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My Salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
    }
    
    public void raisesalary() {
        salary += 10000;
        System.out.println("Salary raised! New salary: " + salary);
    }
}

public class demo5Project {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee emp = null;
        int ch1, ch2;
        
        do {
            System.out.println("================================");
            System.out.println("1) Display");
            System.out.println("2) Create");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            ch1 = sc.nextInt();
            
            if (ch1 == 1) {
                if (emp != null) emp.display();
                else System.out.println("No employee created yet.");
            } else if (ch1 == 2) {
                do {
                    System.out.println("================================");
                    System.out.println("1) Developer");
                    System.out.println("2) Tester");
                    System.out.println("3) Clerk");
                    System.out.println("4) Back");
                    System.out.print("Enter your choice: ");
                    ch2 = sc.nextInt();
                    
                    if (ch2 == 1) emp = new Developer();
                    else if (ch2 == 2) emp = new Tester();
                    else if (ch2 == 3) emp = new Clerk();
                } while (ch2 != 4);
            } else if (ch1 == 3) {
                if (emp != null) {
                    System.out.println("Raising salary...");
                    emp.raisesalary();
                } else {
                    System.out.println("No employee has been created yet.");
                }
            } else if (ch1 == 4) {
                System.out.println("Thank you!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (ch1 != 4);
    }
}
