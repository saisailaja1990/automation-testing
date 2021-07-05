package oopsConcepts;
import java.util.ArrayList;
public class Usingcollections
{
	public static void main(String[] arg)
	{

		ArrayList alist=new ArrayList();
		alist.add(2020);
		alist.add(false);
		alist.add("sunnel");
		System.out.println("The list of items in the array:");
		for(Object i:alist)
	System.out.println(i);
	int[]j= {191,393,292,};
	int[]k;
	k=j.clone();
	System.out.println("The integer values of j:");
	for (int m=0;m<=2;m++)
	{
		System.out.println(j[m]);
	}



	System.out.println("Afer copying the values of j to l");
	for(int l:k)
	{
		System.out.println(l);
	}
		
	}
	}
