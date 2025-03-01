//************************Array*******************************************
package Collections;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("==========Simple Loop================");
		for(int i=0; i<a.length;i++)
		{
			System.out.println("A : "+a[i]);
		}
		
		System.out.println("==========For Each Loop=============");
		for(int x : a)
		{
			System.out.println("X : "+x);
		}
		//***************************************************************
		int ar[] = new int[5];
		ar[0]=000;
		ar[1]=111;
		ar[2]=222;
		ar[3]=333;
		ar[4]=444;
		System.out.println("==========Simple Loop================");	
		for(int i=0; i<ar.length;i++)
		{
			System.out.println("A : "+ar[i]);
		}
		
		System.out.println("==========For Each Loop=============");
		for(int x1 : ar)
		{
			System.out.println("X : "+x1);
		}
		
		//***************************************************************
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("==========Simple loop taking Input================");
		for(int i=0; i<size;i++)
		{
			arr[i] =sc.nextInt();
		}
		System.out.println("==========Simple Loop================");
		for(int i=0; i<size;i++)
		{
			System.out.println("Arr : "+arr[i]);
		}
		

	}

}
