package javaSampleprogram;
import java.util.Scanner;

public class UsingSwitchcase
{

	public static void main(String[] args)
	{
	int i=10;
	int j=30;
	int result=0;
	String option = null;
	System.out.println("Enter Number1 :"+i);
	System.out.println("Enter Number2 :"+j);
	Scanner sc=new Scanner(System.in);
	String choice;
	boolean Isvalid=true;
	System.out.print("Enter the choice of operation:");
	choice =sc.next();
	if(option.equals("yes"))
	{
	switch(choice)
	{
	case"+":
		result=i+j;
		System.out.println("addition od 10 &30:"+result);
		break;
	
			
		case"-":
			result=j-i;
			System.out.println("Subtraction of 30 & 10:"+result);
			
			break;
		case"*":
			result=i*j;
			System.out.println("Multiplication of 10 & 30:"+result);
			break;
		case"%":
			result=i%j;
			System.out.println("reminder of 10 & 30:"+result);
			break;
			
		default :
			Isvalid=false;
			System.out.println(" Your Selection is out of choice");
			break;
																	
	}
	System.out.println("do you want to continue:y/n:");
	option=sc.next();
	}

}}