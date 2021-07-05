package javaSampleprogram;
import java.util.Scanner;

public class UsingIfElse {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter i value:");
		 int i=sc.nextInt();
		 System.out.print("Enter j value:");
		 int j=sc.nextInt();
		 
		 if(i>=j)
		 {
			 System.out.print("i is GREATER THEN  or equal to j");
		 }
			 else
			 {
				 System.out.print("i is SMALLER THEN  j");
		 }
		
			
		}
			

	}
