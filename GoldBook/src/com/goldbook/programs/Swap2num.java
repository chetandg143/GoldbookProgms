package com.goldbook.programs;

import java.util.Scanner;

public class Swap2num {

	public static void main(String[] args)
	{
	
	//swap two numbers without using temp variable 	
	Scanner sc =new Scanner(System.in);
	System.out.print("enter the values of x :");
	int x =sc.nextInt();
	System.out.print("enter the value of y :");
	int y =sc.nextInt();
	
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("value of x:"+x);
	System.out.println("value of y :"+y);
	

	}

}
