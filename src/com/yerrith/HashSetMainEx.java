package com.yerrith;

import java.util.HashSet;


public class HashSetMainEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		    HashSet<HashSetEx> set=new HashSet<HashSetEx>();  
		    //Creating Books  
		    HashSetEx b1=new HashSetEx(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		    HashSetEx b2=new HashSetEx(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    HashSetEx b3=new HashSetEx(103,"Operating System","Galvin","Wiley",6);  
		    //Adding Books to HashSet  
		    set.add(b1);  
		    set.add(b2);  
		    set.add(b3);  
		    //Traversing HashSet  
		    for(HashSetEx b:set){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  
		  

	

	}


