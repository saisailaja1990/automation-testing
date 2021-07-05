package javaSampleprogram;
import java.util.Scanner;
public class UsingNestedif2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Salary:");
		int sal=sc.nextInt();
		if (sal>=20000 && sal<=40000)
		{
			System.out.println("Grade C");
		}
		else if(sal>=40000 && sal<=60000)
		{
			System.out.println("Grade B");
		}
		else if(sal>=60000)
		{
			System.out.println("Grade A");
		}
		else
		{
			System.out.println("U enter invalid credential");
	}
	}

}
