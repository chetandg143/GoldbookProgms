package com.goldbook.programs;

import java.util.Scanner;

public class EvenandOddnumbers {

	public static void main(String[] args) 
	{
	/*	Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
		int num =sc.nextInt();*/
		int num=20;
	//to find even numbers	
		System.out.println("Even numbers are : ");
		for(int i =0;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i);
			}
		}
     //find odd numbers 
		System.out.println("Odd numbers are : ");
		for(int i =0;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i);
			}
		}

	}

}
