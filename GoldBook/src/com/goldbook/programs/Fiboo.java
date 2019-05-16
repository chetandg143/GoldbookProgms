package com.goldbook.programs;

public class Fiboo {

	public static void main(String[] args) {

       int f1=0 ,f2=1, f3=0;
       System.out.print(f1 +" "  +f2+" " );
       while(f1+f2<=100)
       {
    	   f3 =f1 +f2;
    	   System.out.print(f3 + " ");
    	   f1 = f2;
    	   f2 = f3;
    	   
       }

	}

}
