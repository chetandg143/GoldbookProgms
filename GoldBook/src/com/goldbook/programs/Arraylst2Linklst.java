package com.goldbook.programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylst2Linklst {

	public static void main(String[] args) 
	{
	//Array list to linked list
	ArrayList lst =new ArrayList<>();
	lst.add(10);
	lst.add(30);
	lst.add(5);
	lst.add(50);
	
	LinkedList l1=new LinkedList<>(lst);
	System.out.println("Arraylist to Linked list:"+l1);
	
	
	//linked list to Array list
	LinkedList ls=new LinkedList<>();
	ls.add(5);
	ls.add(40);
	ls.add(51);
	ls.add(80);
	
	ArrayList ls1 = new ArrayList<>(ls);
	System.out.println("Linked list to Array List :"+ls1);
	
	//int to string 
	int i=100;
	String s1 =Integer.toString(i);
	System.out.println(s1);
	
	//String into int 
	int i2=Integer.parseInt(s1);
	System.out.println(i2);

	//char to String 
	char ch ='C';
	String s = Character.toString(ch);
	 }

}
