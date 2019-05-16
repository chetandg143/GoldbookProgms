package com.goldbook.programs;

import java.util.Scanner;

public class Reversestr 
{
public static void main(String[] args) 
	{
   // first method 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string :");
    String str = sc.nextLine();
     String str1=" ";
    for(int i=str.length()-1;i>=0;i--)
    {
    	str1= str1 + str.charAt(i);
    }
    System.out.println("Reveresed string is :"+str1);

	}
	
	/*//second method 
	String str2=new StringBuffer(str).reverse().toString();
    System.out.println("Reveresed string is : "+str2);*/

}


