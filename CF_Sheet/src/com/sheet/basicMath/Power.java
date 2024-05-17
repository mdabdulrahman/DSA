package com.sheet.basicMath;

public class Power {
	   public static double pow( double x,int n)
	    {
	        if( n == 0 ) //x^0 = 1
	          return 1;
	        if( n == 1 )  //x^1 = x
	          return x;

	        if( n % 2 == 0 )
	            return pow(((double)x*x),n/2);
	        
	        return ((double)x*pow(x,n-1));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(pow(2.0000,10));
	}

}
