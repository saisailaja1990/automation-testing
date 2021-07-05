package javaSampleprogram;

public class UsingArray {

	public static void main(String[] args)
	{
//		Using Array declaration and initialization in different line.
		int []a= new int[6];
		a[0]=100;
		a[1]=222;
		a[2]=333;
		
		a[3]=444;
		a[4]=676;
		a[5]=34343;
		System.out.println("3rd Elements:"+a[2]);
		//Declaration  and initialization is in same line.
		int []b= {10,20,34,34,45,56,67,78,89,};
		System.out.println("2rd Elements:"+b[1]);
		System.out.println("Before modification 5th Element"+b[4]);
		b[4]=456;
		System.out.println("After modification 4th Element"+b[4]);
	}

}
