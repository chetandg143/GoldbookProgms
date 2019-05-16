

package com.goldbook.programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Uniquevalues {

	public static void main(String[] args) 
	{
     int arr[] = {0,0,0,1,2,1,0,3,4,5,5,5,4,6,7,8};
     Set set=new LinkedHashSet<>();
     for(int val : arr)
     {
    	 set.add(val);
     }
    // System.out.print(" "+set+" ");
     int arr1[]=new int[set.size()];
     int index=0;
     for(Object obj : set)
     {
    //	 System.out.print(" "+obj+" ");
    	 arr1[index++] = ((Integer)obj).intValue();
     }
     System.out.println(Arrays.toString(arr1));
     }
}

