package com.yerrith;


public class PerimidExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 
		for (int i = 0; i < 5; i++) 
		{
		for (int j = 0; j < 5 - i; j++)
		{ 
		System.out.print(" "); 

		} 
		for (int k = 0; k <= i; k++)
		{ 
		System.out.print("* "); 

		}
		for (int l = 0; l < 5 - i; l++)
		{ 
		System.out.print("^ "); 

		} 
		System.out.println();
		}

		//Read more: http://www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html#ixzz4xd8naNMN
		
	}

}
