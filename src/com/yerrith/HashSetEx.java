package com.yerrith;

import java.util.HashSet;
import java.util.Iterator;




	/**
	 * @param args
	 */
	class HashSetEx {  
		int id;  
		String name,author,publisher;  
		int quantity;  
		public HashSetEx(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		}  
		 class HashSetExample {  
		public static void main(String[] args) {  
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


