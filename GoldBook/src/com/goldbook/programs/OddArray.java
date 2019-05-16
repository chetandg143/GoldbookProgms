package com.goldbook.programs;

public class OddArray {

	public static void main(String[] args)
	{
	
	int arr[]={10,20,30,40,50,60};
	//print array elements at ODD index
	System.out.println("ODD index elements are :");
	for(int i=1;i<arr.length;i=i+2)
	{
		System.out.println(arr[i]);
		
	}

	
	
	//print array elements at even index
	System.out.println("Even index elements are : ");
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
			
		}
	
	
	}

}
