package com.goldbook.programs;

import java.util.HashSet;
import java.util.Set;

public class Numberseries {

	public static void main(String[] args)
	{
	Set set = new HashSet<>();
	while(set.size()!=100)
	{
		int val =(int)(100*Math.random());
	    if(!set.contains(val)) {
	    	System.out.print(val+" ");
	    	set.add(val);
	    }
        }
	}
}