package com.goldbook.programs;

import java.util.Scanner;

public class Stringandnumber {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string :");
		String str =sc.nextLine();
		String str1="";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) 
			{
				str1 =str1 + ch;
			}
			else if(Character.isAlphabetic(ch))
			{
			   str2 =str2 +ch;	
		    }
		}
	 	System.out.println(str1 + "\n" +str2);
		}

	}


