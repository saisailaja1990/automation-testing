package oopsConcepts;

class Hotel_Apartdirect

{
	public  String Tenant_Name;
	public  String Address;
	
	public Hotel_Apartdirect()
	{
    Tenant_Name="SUNNEL KAMISETTY";
    Address="HUDVUSTA CENTRUM,STORGATAN 64.";
	}
	
	void display()
	{
		System.out.println("Tenant Name:"+Tenant_Name);
		System.out.println("Address:"+Address);
	}
	}
class spouse extends Hotel_Apartdirect
{
	public String wife_name;
	public String child_name;
	public int Room_no;
	public int floor_no;
	
//	@displaymethod override
	
	void display()
	{
		System.out.println("Spouse Name: "+wife_name);
		System.out.println("Son Name:"+child_name);
		System.out.println("Room Number:"+Room_no);
		System.out.println("Floor Number:"+floor_no);
//		System.out.println("Tenant name"+Tenant_Name);
//		System.out.println("Address"+Address);
		super.display();
	}
	
	
}
public class UsingSinhleinheritance {

	public static void main(String[] args)
	{
		spouse obj=new spouse();
		obj.wife_name="SAILAJA";
		obj.child_name="AJITH";
		obj.Room_no= 401;
		obj.floor_no=4;
		obj.display();
		

	}

}
