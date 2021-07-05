package javaSampleprogram;
import java.util.Scanner;


public class UsingNestedIF {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Monthly Salary:");
		int sal=sc.nextInt();
		int asal;
		asal= sal*12;
		if(asal>20000) 
		{
			System.out.println("Annual Salary:"+asal);
			
		}
		else
			System.out.println("Inavalid Salary Details......");

	}

}
