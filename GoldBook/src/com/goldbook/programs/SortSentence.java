package com.goldbook.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortSentence {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the sentence :");
		String str = sc.nextLine();
		String words[]=str.split("");
		System.out.println("--------Before Sorting--------");
		System.out.println(Arrays.toString(words));
		
		String temp="";
		boolean flag=true;
		while(flag)
		{
			flag=false;
			for(int i=0;i<words.length-1;i++)
			{
				if(words[i].length()>words[i+1].length())
				{
					temp=words[i];
					words[i]=words[i+1];
					words[i+1]=temp;
					flag =true;
					
				}
			}
		}
		System.out.println("--------After Sorting--------");
        System.out.println(Arrays.toString(words));
	}

}
