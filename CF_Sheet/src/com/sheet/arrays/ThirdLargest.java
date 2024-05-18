package com.sheet.arrays;

public class ThirdLargest {

	public static int bruteForceApproach( int[] arr )
	{
		 int first = arr[0], second =Integer.MIN_VALUE , third = Integer.MIN_VALUE;
		    //to find largest
	        for( int i = 1; i < arr.length; i++ )
	        	if( first < arr[i])
	        		first = arr[i];
	        
	        //to find second largest
	        for( int i = 0; i < arr.length; i++ )
	        	if( arr[i] != first && second < arr[i])
	        		second = arr[i];
	        
	        //to find third largest
	        for( int i = 0; i < arr.length; i++ )
	    	   if( arr[i] != first && second != arr[i] && third < arr[i])
	        		third = arr[i];
	
	        return third;
	}
	public static int BetterApproach( int[] arr )
	{
		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MAX_VALUE;
		for( int i = 1; i < arr.length; i++ )
		{
			
			if( first < arr[i] )
			{
				third = second;
				second = first;
				first = arr[i];
			}
			else if ( second < arr[i] )
			{
				third = second;
				second = arr[i];
			}
			else if( third < arr[i])
			{
				
				third = arr[i];
			}
			
		}
		return third;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {2,2,3,1};
       
        
        System.out.println(bruteForceApproach(arr));
        System.out.println(BetterApproach(arr));
	}

}
