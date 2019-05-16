package com.goldbook.programs;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Squarenumber {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number :");
	int num =sc.nextInt();
	int sq=0;
	for(int i=1;i<(num/2);i++)
	{
		if((i*i)==num)
		{
		sq = i;
		break;
		}
		}
	if(sq==0)
		System.out.println(" not a perfect number ");
	else
	System.out.println(num+ " is perfect square number of "+sq);
	}

}
