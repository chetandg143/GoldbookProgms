 package com.goldbook.programs;

import java.util.Scanner;

public class Separator {

	public static void main(String[] args)
	{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter the string :");
	 String str1 = sc.nextLine();
	 
	 
	String str2=" ";
	String str3=" ";
	for(int i=0;i<str1.length();i++)
	{
		char ch =str1.charAt(i);
		if(Character.isAlphabetic(ch))
		{
			str2 =str2 + ch;
		}
		else if(Character.isDigit(ch))
		{
			 str3 =str3 + ch ;
		}
		
	}
   System.out.println(str2 + " \n "+ str3);
	}

}
