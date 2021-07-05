package javaSampleprogram;
import java.util.Scanner;

public class UsingDoWhile2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String Email,pwd;
		do {
			System.out.print("Enter EmailId:");
			Email=sc.nextLine();
			System.out.print("Enter password:");
			pwd=sc.nextLine();
			
		}while(!Email.equals("sailu@gmail.com")|| !pwd.equals("suneel!143"));
		
		System.out.println("Valid credentials");
		

	}

}
