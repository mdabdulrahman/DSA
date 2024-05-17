package com.sheet.basicMath;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = (long)GetInput.getNumber();
		
		long high = x;
		long low = 1;
		long mid = x/2;
	
		long prevVal=mid;//t != x && low <= high
		long t = mid*mid;
		//int tr = 5;
		while( t != x && low <= high)
		{
			
		
		    
		    if( t > x)
		    {
		       
		       high = mid - 1;
		       mid = (high+low)/2;
		    }
		    else if( t < x)
		    {
		    	prevVal = mid;
		        low = mid+1;
		        mid =( high+low)/2;
		    }
		    
		    t = mid*mid;
		   
		}
		
		if( mid <= 1)
		  System.out.println(prevVal);
		  
		System.out.println(mid);
	}

}
