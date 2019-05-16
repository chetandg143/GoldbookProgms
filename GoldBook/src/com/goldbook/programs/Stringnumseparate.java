package com.goldbook.programs;

import java.util.Scanner;

public class Stringnumseparate {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string :");
		String str =sc.nextLine();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				str1 =str1 + ch;
			}
		}
		System.out.println(str1);
		}
	

}
