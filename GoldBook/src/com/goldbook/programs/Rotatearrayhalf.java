package com.goldbook.programs;

public class Rotatearrayhalf {

	public static void main(String[] args) 
	{
	int arr[] = {10,35,15,23};
	int start =arr.length/2;
	int end =arr.length-1;
	int temp=0;
	for(int i=start;i<(start+arr.length/4);i++)
	{
		temp =arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	for(int i:arr)
	{
		System.out.println(i);
	}
	}

}
