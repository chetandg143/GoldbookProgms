package collection.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
public static void main(String[] args) 
	{
	ArrayList lst = new ArrayList<>();
	lst.add(213);
	lst.add("java");                                                 
	lst.add("selenium");
	lst.add(12);
	lst.add("12345");     
	lst.add(null);
	/*for(int i=0;i<lst.size();i++)
	{
		System.out.println(lst.get(i));
	}
*/	
	Iterator il = lst.iterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
	}

}
