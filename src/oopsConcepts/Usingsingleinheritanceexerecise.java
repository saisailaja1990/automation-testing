package oopsConcepts;
//Implement Single Inheritance with following description
//
//1. Create a class called 'Products' with 
//
//	a. prodid,prodname,unitprice data members
//
//	b. a constructor to provide initial values
//
//	c. Display() to print the details
//
//2. Create a class called 'Orders' with
//
//	a. ordid,qty data members
//	
//	b. inherit 'Products' class to get products details
//
//	c. Display() to override base class method to print ordid,prodid,prodname,qty,unitprice,total
//
//3. use main() to call the functionalities from the 'Orders' class


class product
{
	public int prodid;
	public String prodname;
	public int unitprice;
	
	public product()
	{
		prodid=201;
		prodname="marc jacobs sunglasses";
		unitprice=16000;
	}
	void display()
	{
		System.out.println("Product ID:"+prodid);
		System.out.println("Product Name:"+prodname);
		System.out.println("Unit price:"+unitprice);
		
	}
	}
class Orders extends product
{
	public int ordid;
	public int qty;
	public int total;
	
	void display()
	{
		super.display();
		System.out.println("Order Id:"+ordid);
		System.out.println("quantity order:"+qty);
		System.out.println("total amount :"+total);
		
		
	}
	
	}

public class Usingsingleinheritanceexerecise {

	public static void main(String[] args)
	{
		
		Orders obj=new Orders();
		obj.ordid=102;
		obj.qty=3;
		int unitprice=16000;
		obj.total=unitprice*obj.qty;
		obj.display();
		
	}

}
