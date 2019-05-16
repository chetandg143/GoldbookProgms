package com.goldbook.programs;

import java.util.Scanner;

public class countalphabets
{
public static void main(String[] args) 
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the string :");
String str =sc.nextLine();
int count = 0;
String str2="";
for(int i=0;i<=str.length()-1;i++)
{
	char ch =str.charAt(i);
	if(ch=='a')
	{
		count++;
	}
}
System.out.println(" A is occurance of "+count+" times ");


//print Ascii values 
for(int j=0;j<=128;j++)
{
	System.out.println(j+" --> "+ (char)j + "  ");
}


}
}
