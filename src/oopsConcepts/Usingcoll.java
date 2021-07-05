package oopsConcepts;
import  java.util.ArrayList;  

public class Usingcoll
{

	public static void main(String[] args) 
	{
		ArrayList alist=new ArrayList();
		alist.add(10);
		alist.add("shailaja");
		alist.add(false);
		for(Object item :alist)
		{
			System.out.println(item);
		}
		System.out.println(" the size of elements in colloection:"+alist.size());
		System.out.println("The second element in the collection is :"+alist.get(1));
		alist.add(1,"sunnel");
		System.out.println("after inserting an element at index 1:");
		System.out.println("the list of items is :");
		for (Object item:alist)
		{
			System.out.println(item);
		}
		alist.remove(1);
		System.out.println("remove the element @ index1");
		for(Object item:alist)
		{
			System.out.println(item);
			
		}
		System.out.println("size "+alist.size());
		

	}

}
