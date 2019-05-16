package com.goldbook.programs;

import java.util.Scanner;

public class Armstrong 
{
public static void main(String[] args) 
{
	/*Scanner sc =new Scanner(System.in);
	System.out.println("enter the number ");
	int num =sc.nextInt();*/
	for(int num=100;num<1000;num++)
	{
    int temp =num;
    int sum=0;
    while(temp!=0)
    {
    int r =temp %10;
    sum=sum + r*r*r;
    temp= temp/10;
    }
    if(num==sum)
    {
     System.out.println(num+" is  arm strong number");   	
    }
 /*   else
    {
        System.out.println(num+" is not arm strong number");   	

    }*/
}
}
}
