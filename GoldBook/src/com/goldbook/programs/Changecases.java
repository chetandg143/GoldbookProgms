package com.goldbook.programs;

import java.util.Scanner;import javax.print.DocFlavor.CHAR_ARRAY;

public class Changecases {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string :");
		String str =sc.nextLine();
		StringBuffer sb =new StringBuffer();
        for(int i=0;i<=str.length()-1;i++)
        {
        	
        	char ch=str.charAt(i);
        	if(Character.isLetter(ch))
        	{
        		ch=str.charAt(i);
        		if(Character.isUpperCase(ch))
        		{
        			sb.append(Character.toLowerCase(ch));
        		}
        		else
        		{
        			sb.append(Character.toUpperCase(ch));
        		}
        	}
        	else
        	{
        		sb.append(ch);
        	}
        }
     System.out.println( str);
     System.out.println(sb);
	}

}
