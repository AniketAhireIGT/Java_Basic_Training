import java.util.Scanner;
class A
{
    A()
    {
        System.out.println("Hi Constructor.....!");
    }
    void display()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Hi Method.....!");
        }
    }
}
class demo3 {
    public static void main(String[] args) 
    {
        A a = new A();
        
        a.display();
        a.display();
        a.display();
        
    }
}