package com.goldbook.programs;

import java.util.Arrays;

public class DeletevaluesinArray {

	public static void main(String[] args) 
	{
	 int arr[]= {10,20,30,40,60,50};
	 System.out.println(Arrays.toString(arr));
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=0;
	 }
   System.out.println(Arrays.toString(arr));
	}

}
