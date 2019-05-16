package Myprograms;

import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) 
	{
		 String st;
			int i;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String in Uppercase :");
		 	st=sc.nextLine();
			char str[]=st.toCharArray();
	 		for(i=0;i<str.length;i++)
	 		{
	     		if(str[i]>='A' && str[i]<='Z')
	     		{ 
	     			str[i]=(char)((int)str[i]+32);
	     		}
	 		}
	 		System.out.println("The string converted into Lowercase is : ");
	 			for(i=0;i<str.length;i++)
	 			System.out.print(str[i]);
		}
	     

	}


