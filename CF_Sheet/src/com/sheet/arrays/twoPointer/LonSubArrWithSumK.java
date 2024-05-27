package com.sheet.arrays.twoPointer;

import com.sheet.arrays.GetInputArr;
import java.util.*;
public class LonSubArrWithSumK {
    
	 public static int bruteForce (int A[], int N, int K) {
	       
		    //Time Complexity : O( N^2 )
		   //Space Complexity : O ( 1 )
	        int len ;
	        int maxLen = 0;
	        int sum = 0;
	        for( int i = 0; i < N; i++)
	        {
	            len = 0;
	            sum = 0;
	            // if maximum possible subarray length from i is equal to maxLength
	            if( maxLen == N - i )
	            	break;
	         
	            for( int j = i; j < N; j++)
	            {
	                sum += A[j];
	                len++;
	                if( sum == K )
	                {
	                    if( len > maxLen)
	                      maxLen = len;
	                }
	             
	            }
	        }
	        return maxLen;
	    }


	    // Function for finding maximum and value pair
	    public static int better (int A[], int N, int K) {
	        //Complete the function
	        Map<Integer,Integer> prefixSum = new HashMap<>();
	        int sum = 0;
	        int maxLength = 0;
	        int len;
	        for( int i = 0; i < N; i++ )
	        {
	            sum += A[i];
	           
	         
	            if( sum == K )
	              maxLength = Math.max( maxLength, i+1);
	            
	            if( prefixSum.containsKey( sum - K ) )
	                maxLength = Math.max( maxLength , (i - prefixSum.get( sum - K )  )  );
	                
	            if( !prefixSum.containsKey(sum))
	               prefixSum.put( sum , i );
	             
	        }
	        return maxLength;
	    }
	    
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = GetInputArr.getArray();
       int K = GetInputArr.getNumber();
       System.out.println(better(arr,arr.length,K));
	}

}
