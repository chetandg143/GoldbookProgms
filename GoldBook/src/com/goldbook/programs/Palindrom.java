package com.goldbook.programs;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the string :");
	String s1 =sc.nextLine();
	
	String reverse="";
	int length =s1.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse = reverse + s1.charAt(i);
	}
	if(s1.equals(reverse))
	{
		System.out.println(s1+ " is Palindrome ");
	}
	else
	{
		System.out.println("given string is not Palindrome ");
	}

	}
  
}
