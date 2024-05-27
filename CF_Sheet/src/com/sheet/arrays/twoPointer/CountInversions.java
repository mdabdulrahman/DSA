package com.sheet.arrays.twoPointer;

import com.sheet.arrays.GetInputArr;

public class CountInversions {
    public static int  bruteForce( int[] arr )
    {
    	int count = 0;
    	for( int i = 0; i < arr.length - 1; i++ )
    	{
    		for( int j = i + 1; j < arr.length; j++ )
    		{
    			if( arr[i] > arr[j])
    				count++;
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = GetInputArr.getArray();
         System.out.println(bruteForce(arr));
	}

}
