package com.Threads;
class Taskone  extends Thread
{
	@Override 
	public  void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Taskone Thread");
		}
	}
 class Tasktwo  extends Thread
	{
		@Override 
		public void run()
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println("Tasktwo Thread");
			}
		}
	}

public static void main(String[] args)
	{
	    Taskone t1 =new Taskone();
	  //  Tasktwo t2 =new Tasktwo();
	    
	    t1.start();
	  //  t2.start();

	}
	}
