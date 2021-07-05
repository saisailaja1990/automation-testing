package javaSampleprogram;
import java.util.Scanner;
public class UsingBreak
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String uid,pwd;
		int count=0;
		do
		{
//		
			
			if(count>0)
			{
				System.out.println("invalid credentials");
			}
				
			System.out.print("Enter the userid :");
			uid=sc.nextLine();
			System.out.print("Enter the password:");
			pwd=sc.nextLine();
			count++;
			if (count==3) 
			{
				System.out.println("Your 3 choices finish,Access denied");
				break;
			}
			
		}while(!uid.equals("java")||!pwd.equals("programs"));
		System.out.println("Login sucessfull");

	
	}
}



