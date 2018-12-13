package com.yerrith;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<Integer> al=new ArrayList<Integer>();
			  al.add(1);
			  al.add(2);
			  al.add(1,2);
			//  al.add("Ajay");

			  Iterator itr=al.iterator();
			  while(itr.hasNext()){
			   System.out.println(itr.next());
			  }
			 }

	}


