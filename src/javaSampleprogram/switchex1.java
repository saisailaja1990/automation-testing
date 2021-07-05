package javaSampleprogram;
import java.util.Scanner;

public class switchex1 
{

	public static void main(String[] args) 
	{
		int i=40;
		int j=50;
		String choice,options;
		int result=0;
		
		do
		{
		System.out.println("Enter value1 :"+i);
		System.out.println("Enter vale2:"+j);
		Scanner sc=new Scanner(System.in);
		System.out.print("Select the arithmatic Operations(+/-/*/%):");
		choice= sc.next();
		boolean Isvalid=true;
		switch(choice)
		{
		case"+":
			result=i+j;
			System.out.println("addition of 40 & 50:"+result);
			break;
		
				
			case"-":
				result=j-i;
				System.out.println("Subtraction of 40 & 50:"+result);
				
				break;
			case"*":
				result=i*j;
				System.out.println("Multiplication of 40 & 50:"+result);
				break;
			case"%":
				result=i%j;
				System.out.println("reminder of 40 & 50:"+result);
				break;
				
			default :
				Isvalid=false;
				System.out.println(" Your Selection is out of choice");
				break;
																		
		}
		
		
		
		
		System.out.println("Do you want to continue:yes/no");
		options= sc.next();
		}while(options.equals("yes"));
		

}
}