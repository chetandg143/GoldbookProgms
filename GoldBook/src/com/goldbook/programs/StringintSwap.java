
package com.goldbook.programs;

import java.util.Scanner;

public class StringintSwap {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);	
	System.out.println("enter values of s1 :");
	String s1 =sc.next();
	
    System.out.println("enter value of s2 :");
    String s2=sc.next();
    
    s2=Integer.toString(Integer.parseInt(s1)+Integer.parseInt(s2));
    s1=Integer.toString(Integer.parseInt(s2)-Integer.parseInt(s1));
    s2=Integer.toString(Integer.parseInt(s2)-Integer.parseInt(s1));

    System.out.println("after swap s1 :"+s1);
    System.out.println("after swap s2 :"+s2);
	}
}
