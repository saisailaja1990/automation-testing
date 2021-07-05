package javaSampleprogram;

public class UsingTypecasting
{

	public static void main(String[] args) 
	{
	//Widening Type casting
		System.out.println("Widening Type casting");
		
		   int i=10;
		   
		   long l=i;
		  
		   float f=l;
		   
		   
		   double d=f;
		   
		   System.out.println("Before conversion,int :" +i);
		   
		   System.out.println("After conversion,long :" +l);
			
		   System.out.println("After conversion,float :" +f);
		   
		   
		   System.out.println("After conversion,double :" +d);
		   
		  // Narrow Type casting
		  
		   System.out.println("Narrow Type casting");
		   
		   double g=123.56;
		   
		   float h=(float)g;
		   
		   long n=(long)h;
		  
		    int m=(int)n;
		    
		    System.out.println("Before conversion,double :" +g);
			   
			   System.out.println("After conversion,float :" +h);
				
			   System.out.println("After conversion,long :" +n);
			   
			   
			   System.out.println("After conversion,int :" +m);
			   
			
			

	}
	

}

