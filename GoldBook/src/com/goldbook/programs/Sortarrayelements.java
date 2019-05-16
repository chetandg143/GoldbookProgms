package com.goldbook.programs;

import java.util.Arrays;

public class Sortarrayelements
{
public static void main(String[] args) 
{
int arr[] = new int[5];
arr[0]=10;
arr[1]=30;
arr[2]=44;
arr[3]=50;
arr[4]=25;
Arrays.sort(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
}
}
