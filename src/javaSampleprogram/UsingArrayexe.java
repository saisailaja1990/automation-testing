package javaSampleprogram;
import java.util.Scanner;

public class UsingArrayexe {

	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int i=sc.nextInt();
		int []a= new int[i];
		for (int j=0;j<5;j++)
		{
			Scanner ele= new Scanner(System.in);
			int []a= int ele.nextInt();
			System.out.println("List of Array items="+a[j]);
			
		}
		
}		
}