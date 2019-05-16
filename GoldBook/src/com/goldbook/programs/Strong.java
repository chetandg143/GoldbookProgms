
package com.goldbook.programs;

import java.util.Scanner;

public class Strong {
   public static  int isfact(int n)
   {
	   int fact=1;
	for(int i=n;i>0;i--)
	{
		fact=fact *i;
	}
	return fact;  

   }
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
	///	int num =sc.nextInt();
	for(int num=100;num<500;num++)
		{
        int temp =num;
        int sum=0;
        while(temp!=0)
        {
        int rem =temp %10;
        sum=sum + isfact(rem);
        temp= temp/10;
        }
        if(num == sum)
        {
        	System.out.println("Number "+num+ " is an  strong number");
        }
        else
        {
        	System.out.println("Number "+num+ " is no an strong number ");
        }
     
	}
	}
}
