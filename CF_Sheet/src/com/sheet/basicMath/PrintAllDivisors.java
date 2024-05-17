package com.sheet.basicMath;

public class PrintAllDivisors {

	public static void printAllDivisorsB( int num ) //brute force
	{
		int curr = 1;
		while( curr <=num )
		{
			if( num%curr == 0)
			 System.out.print(curr+"\t");
			curr++;
		}
	}
	public static void printAllDivisorsO( int num ) //optimized
	{
		
		for( int i = 1; i <= Math.sqrt(num);i++)
		{
			if( num % i == 0 )
			{
				System.out.print(i+"\t");
				if( num / i != i)
					  System.out.print( num/i +"\t");
				
			}
		}
		
		
	}
	public static void main(String[] args) 
	{
		int num = GetInput.getNumber();
         printAllDivisorsO(num);
         System.out.println();
         printAllDivisorsB(num);
	}

}
