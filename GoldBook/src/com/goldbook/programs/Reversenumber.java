package com.goldbook.programs;

import java.util.Scanner;

public class Reversenumber 
{
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number to be reverse :");
	int num=sc.nextInt();
	
	/*//short cut method using inbuilt methods
	int reverse =Integer.parseInt(new StringBuffer(Integer.toString(num)).reverse().toString());
	System.out.println("given number to be reversed : "+reverse);*/
	
	//alternate method to reverse the number 
    int sum=0;
	while(num>0)
	{
    int rem=num%10;
   // System.out.println(rem);
	 sum =sum *10+ rem ;
	 num =num/10;
	}
	System.out.println("reversed number is : "+sum);
 
}
}
