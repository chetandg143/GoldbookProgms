package com.Threads;

public class Rintef 
{
	public static void main(String[] args) 
	{
	   System.out.println(" main Thread starts ...");
	   Runnable r1 =()->
	   {
        for(int i=1;i<=3;i++)
        {
        	System.out.println("task one");
        }
		};
		 Runnable r2 =()->
		   {
	        for(int j=1;j<=3;j++)
	        {
	        	System.out.println("task two");
	        }
			};
          Thread t1 =new Thread(r1);
          Thread t2 =new Thread(r2);
          
          t1.start();
          t2.start();
          
}
}