package com.yerrith;


public class NumberOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 1;
		for(int i=1; i<=5; i++)
		{
		if(i % 2 != 0)
		{
		for(int j = m;j <= m+4;j++)
		{
		System.out.print( j+ " ");
		}
		}
		else
		{
		for(int j = m+4;j >= m;j--)
		{
		System.out.print( j+ " ");
		}
		}
		System.out.println(""); 
		m= m+5;
		}

		//Read more: http://www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html#ixzz4xdAiFjzo
	}

}
