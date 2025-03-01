import java.util.Scanner;
 
class Demo2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID : ");
        int id = sc.nextInt();
        System.out.print("Name : ");
        String name = sc.next();
        System.out.print("Age : ");
        int age = sc.nextInt();
         System.out.print("salary : ");
        int sal = sc.nextInt();
         System.out.print("Designation : ");
        String des = sc.next();

	System.out.println("======================");
        System.out.println("My ID is : "+id);
        System.out.println("My Name is : "+name);
        System.out.println("My Age is : "+age);
        System.out.println("My salary is : "+sal);
        System.out.println("My Designation is : "+des);

    }
}