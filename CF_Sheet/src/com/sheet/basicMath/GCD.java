package com.sheet.basicMath;

public class GCD 	
{
   public static int GCDR( int a, int b )
   {
	   if( b == 0 )
		   return a;
	   return GCDR( b, a%b );
   }
   public static int GCDI( int a, int b)
   {
	   if( a%b == 0 )
		   return b;
	   if( b % a == 0 )
		   return a;
	   int t ;
	   while( a%b !=0 )
	   {
		   t = b;
		   b = a % b;
		   a = t;
	   }
	   return b;
   }
   public static void main(String[] args)
   {
	   int[] ab = GetInput.getTwoNumber();
	   System.out.println("GCD Recursion : "+GCDR(ab[0],ab[1]));
	   System.out.println("GCD Loop : "+GCDI(ab[0],ab[1]));
   }
}
