package com.goldbook.programs;

import java.util.Scanner;

public class multipliction {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number 1 ");
		int x =sc.nextInt();
		System.out.println("enter the number 2");
		int y =sc.nextInt();
		int result=0;
		for(int i=1;i<=y;i++)
		{
			result = result + x;
		}
System.out.println("multiplcation result :"+x+" * "+y+" = "+result);
	}

}
