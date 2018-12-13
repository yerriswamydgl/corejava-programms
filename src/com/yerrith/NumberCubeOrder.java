package com.yerrith;


public class NumberCubeOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int m=5;
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(m);

		}
		m--;
		System.out.println("");
		}

		int n=2;
		for(int i=1;i<=4;i++)
		{

		for(int j=4;j>=i;j--)
		{
		System.out.print(n);
		}
		n++;
		System.out.println("");
		}

		//Read more: http://www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html#ixzz4xdLOUkYB

	}

}
