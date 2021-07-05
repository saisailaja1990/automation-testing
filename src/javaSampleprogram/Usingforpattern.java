package javaSampleprogram;

public class Usingforpattern 
{

	public static void main(String[] args)
	{
		
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				continue;
			}System.out.print(i+"\t");
		}
		System.out.println();
		
		for(int j=5;j<=50;j=j+5)
		{
			if(j%5!=0)
			{
				continue;
			}
			System.out.print(j+"\t");
	}
         System.out.println();
		for (int x=0;x<=100;x=x+10)
		{
			
		System.out.print(x+"\t");	
		}
		System.out.println();
	for(int y=100;y>=0;y=y-10)
		
	{
		System.out.print(y+"\t");
	}
	
	}
	
	}


