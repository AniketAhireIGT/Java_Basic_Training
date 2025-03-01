package com;
import java.util.Scanner;

// Interface
interface I {
    void travel();
}

// Abstract class
abstract class emp {
    int id;
    int age;
    String name;
    String designation = "Trainee";
    int salary = 20000;

    emp() 
    {
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

    abstract void raisesalary();
}

class Developer extends emp implements I 
{
    Developer() { }

    void display() {
        System.out.println("================================");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
        System.out.println("================================");
    }

    void raisesalary() {
        salary += 40000;
        System.out.println("Salary raised! New salary: " + salary);
    }

    @Override
    public void travel() {
        System.out.println("Travelling through own Car");
    }
}

class Tester extends emp implements I
{
    Tester() { }

    void show() {
        System.out.println("================================");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
        System.out.println("================================");
    }

    void raisesalary() {
        salary += 20000;
        System.out.println("Salary raised! New salary: " + salary);
    }

    @Override
    public void travel() {
        System.out.println("Travelling through company car");
    }
}

class Clerk extends emp implements I {
    Clerk() { }

    void showcase() {
        System.out.println("================================");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
        System.out.println("================================");
    }

    void raisesalary() {
        salary += 10000;
        System.out.println("Salary raised! New salary: " + salary);
    }

    @Override
    public void travel() {
        System.out.println("Travelling through company bus");
    }
}


public class Demo4Project {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Developer d = null;
        Tester t = null;
        Clerk c = null;
        I obj = null;

        int ch1 = 0, ch2 = 0;

        do {
            System.out.println("================================");
            System.out.println("1) Display");
            System.out.println("2) Create");
            System.out.println("3) Raise Salary");
            System.out.println("4) Travelling via");
            System.out.println("5) Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                if (d != null) d.display();
                if (t != null) t.show();
                if (c != null) c.showcase();
            } else if (ch1 == 2) {
                do {
                    System.out.println("================================");
                    System.out.println("1) Developer");
                    System.out.println("2) Tester");
                    System.out.println("3) Clerk");
                    System.out.println("4) Back");
                    System.out.println("================================");
                    System.out.print("Enter your choice: ");
                    ch2 = sc.nextInt();

                    if (ch2 == 1) {
                        d = new Developer();
                    } else if (ch2 == 2) {
                        t = new Tester();
                    } else if (ch2 == 3) {
                        c = new Clerk();
                    }

                } while (ch2 != 4);
            } else if (ch1 == 3) {
                // Raise salary
                if (d != null) {
                    System.out.println("Raising salary for Developer...");
                    d.raisesalary();
                } 
                if (t != null) {
                    System.out.println("Raising salary for Tester...");
                    t.raisesalary();
                } 
                if (c != null) {
                    System.out.println("Raising salary for Clerk...");
                    c.raisesalary();
                } 
                if (d == null && t == null && c == null) {
                    System.out.println("No employee has been created yet.");
                }
            } else if (ch1 == 4) {
               
                if (d != null) {
                    obj = d;
                } else if (t != null) {
                    obj = t;
                } else if (c != null) {
                    obj = c;
                } else {
                    System.out.println("No employee has been created yet.");
                    continue;
                }
                obj.travel();
            } else if (ch1 == 5) {
                // Exit the program
                System.out.println("Thank you!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (ch1 != 5);
    }
}
