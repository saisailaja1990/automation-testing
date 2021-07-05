package oopsConcepts;
class F1
{
	//Using Final key word to variable
	public final  int i=100;
	public  void m1()
	{
		System.out.println("Method M1 from class F1");
	}
	}
class F2 extends  F1
{
	// Using Final keyword to M2 method
	public final void m2()
	
	{
		
		System.out.println("Override Method M1 from class F2.....");
	}
	
	}
class F3 extends F2
{
	public void m3()
	{
		System.out.println("Override Method M1 form class F3");
	}
	}

public class UsingFinalkeyword {

	public static void main(String[] args) 
	{
		F3 obj =new F3();
		
		System.out.println("Intial value of i:"+obj.i);
//		obj.i=459;
//		System.out.print("After modification i value:"+obj.i);
	obj.m1();
	}
	

}
