package com.goldbook.programs;

public class IntegerSorting {

	public static void main(String[] args)
	{
    int num[]= {5,8,2,1,9,15,12,19,65,52,45,45};
    for(int i=0;i<num.length;i++)
    {
    	for(int j=i+1;j<num.length;j++)
    	{
    		if(num[i]>num[j])
    		{
    			int temp = num[i];
    			num[i]=num[j];
    			num[j]=temp;
    		}
    	}
    }
    for(int k=0;k<num.length;k++)
    {
    	System.out.print(" "+num[k]+" ");
    }
	}

}
