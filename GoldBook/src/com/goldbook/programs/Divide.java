package com.goldbook.programs;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.print("enter the number: ");
	int number =sc.nextInt();
	
	System.out.print("enter the divisor: ");
	int divisor =sc.nextInt();
	
	int result=0;
	while((number-divisor)>=0)
	{
		result++;
		number =number - divisor;
	}
	System.out.println("result is: "+result);
	}

}
