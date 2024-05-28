package com.sheet.arrays.twoPointer;

import com.sheet.arrays.GetInputArr;

public class TrappingRainWater {
	public static long bruteForce(int arr[], int n) { 
	        // Your code here
	        
	        int leftMax ;
	        int rightMax ;
	   
	        int sum = 0;
	        for( int i = 1; i < n - 1; i++ )
	        {
	            leftMax = arr[i];
	            //to find left max
	            for( int j = 0;  j < i; j++ )
	             leftMax = Math.max( leftMax , arr[j]);
	           
	            if( leftMax == arr[i])
	              continue;
	           
	            rightMax = arr[i];
	            //to find right max
	            for( int k = i+1; k < n; k++)
	              rightMax = Math.max( rightMax, arr[k]);
	            
	            if( rightMax == arr[i])
	              continue;
	      
	            sum += ( Math.min(leftMax,rightMax) - arr[i] );

	        }
	        return sum;
	        
	    } 
	public static long better(int arr[], int n) { 
        // Your code here
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        
        prefixMax[0] = arr[0];
        //calculate prefix Max
        for( int i = 1; i < n; i++)
          prefixMax[i] = Math.max(prefixMax[i - 1],arr[i] );
        
        suffixMax[ n - 1 ] = arr[ n - 1 ];
        //calculate suffix max
        for( int i = n - 2; i > -1; i--)
           suffixMax[ i ] = Math.max( suffixMax[ i + 1 ],arr[i]);
        
        long sum = 0;
        for( int i = 0; i < n - 1 ; i++)
          sum += ((long) Math.min(prefixMax[i],suffixMax[i]) - arr[i]);
        
          
        return sum;
       
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = GetInputArr.getArray();
       System.out.println(bruteForce(arr,arr.length));
	}

}
