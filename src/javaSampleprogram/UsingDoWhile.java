package javaSampleprogram;
import java.util.Scanner;
public class UsingDoWhile
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String uid,pwd;
		
		do 
		{
			System.out.print("Enter User Name:");
			uid=sc.nextLine();
			System.out.print("Enter PassWord:");
			pwd=sc.nextLine();
		}while(!uid.equals("java")||!pwd.equals("sailu"));

		
		
		

	}

}
