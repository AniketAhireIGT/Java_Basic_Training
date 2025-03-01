//***************************Array****************************************

package Collections_Prac;
import java.util.Scanner;
public class prac1 {

	public static void main(String[] args) {
		
		System.out.println("***********************Array in Java***********************");
		
		int arr[]= {23,34,45,56,67,78,89,99};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(i+"   ");
		}
		System.out.println();
		System.out.println("**************After Updating**********");
		arr[0]=0;
		arr[2]=2;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(i+"   ");
		}
		System.out.println();
		System.out.println("******************For Each Loop******************");
		for(int a :arr)
		{
			System.out.println(a+"  ");
		}
		
		System.out.println();
		System.out.println("******************Input from user******************");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements in array : ");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int a1 :arr1)
		{
			System.out.println(a1+"  ");
		}
			
	}

}
