 package com.goldbook.programs;

public class StringManipulation {

	public static void main(String[] args) 
	{
	/*String str1 = "water";
	String str2 ="bottle";
	String s1 = str1.substring(0,3);	
    String s2=str2.substring(0,str2.length());
    System.out.println(s1+s2);
    */
    String str = "12C34";
    try {
    	Integer.parseInt(str);
    	System.out.println(str+ " is number ");
    }
    catch(NumberFormatException e)
    {
   System.out.println(str + " is not number");
	}

}
}