package com.goldbook.programs;

import java.util.Scanner;

public class Repeatedcount {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	int ar[]= {40,20,10,40,60,25,40,60,20,15,20,60,2,80};
	System.out.println("enter the number to be count :");
	int search =sc.nextInt();
	int count=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]==search)
		{
			count++;
		}
	}
	System.out.println("no of times occures "+search+" is: "+count);
	}

}
