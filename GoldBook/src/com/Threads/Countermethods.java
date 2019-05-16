package com.Threads;

public class Countermethods {
private int v1=1;
synchronized public void increment()
{
	v1++;
}
synchronized public void decrement()
{
	v1--;
}
public void showvalues()
{
	System.out.println(" v1 :"+v1);
}

	public static void main(String[] args) 
	{
		    Countermethods c1 = new Countermethods();
        //lamda function is used achieve the code complexity and avoid creation of methods 
		    Runnable r1 = ()->
            {
            	c1.increment();
            	c1.showvalues();
            };
            
            Runnable r2 = ()->
            {
            	c1.decrement();
            	c1.showvalues();
            };
            Thread t1 =new Thread(r1);
            Thread t2 =new Thread(r2);
            t1.start();
            t2.start();
	}

}
