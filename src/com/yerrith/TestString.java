package com.yerrith;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public class TestString {

	public static void main(String[] args) {
		
		String s="This is Nagpur";
		         String s1[]=s.split(" ");
		         ArrayList al=new ArrayList();
		         for(int i=0;i<=s1.length;i++)
		         {
		        	String s22=null;
		        	for(int j=i+1;j<s1.length;j++) 
		        	{
		        		if(s1[i].length() > s1[j].length())
		        		{
		        			s22=s1[i];
		        			s1[i]=s1[j];
		        			s1[j]=s22;
		        		}
		        	}
		         }
		         for(int c=0;c<s1.length-1;c++) 
		        	{
		        	System.out.println(s1[c]);
		        	}
		       

	}
}



