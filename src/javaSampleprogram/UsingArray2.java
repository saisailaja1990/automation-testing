package javaSampleprogram;

public class UsingArray2 
{

	public static void main(String[] args) 
	{
		int []a= {12,34,23,45};
		System.out.print("a =");
		
		for( int j=0;j<4;j++)
		{
		System.out.print(a[j]+ "\t"+" " );
		}
		System.out.println("\n");

//		 Using foreach loop
		System.out.print("a =");
		
		for (int j : a)
		{
			System.out.print(j +" ");
		}
	}

}
