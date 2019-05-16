package Myprograms;

import java.util.Scanner;

public class UppperAndLower {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String :");
	String s1 =sc.nextLine();
	char str[]=s1.toCharArray();
		for(int i=0;i<str.length;i++)
		{
 		if(str[i]>='a' && str[i]<='z')
 		{ 
 			str[i]=(char)((int)str[i]-32);
 		}
		}
		System.out.println("The string converted into uppercase is : ");
			for(int i=0;i<str.length;i++)
			System.out.print(str[i]);
	
	}
	
	

	}


