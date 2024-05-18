package com.sheet.arrays;

public class SearchElement 
{
    public static int LinearSearch(int[] arr, int n,int target)
    {
    	for( int i = 0; i < n; i++ )
    	{
    		if(	arr[i]	== target)
    			return i;
    	}
    	return -1;
    }
    public static int BinarySearch( int[] arr, int n,int target)
    {
    	int high = n - 1;
    	int low = 0;
    	int mid = ( low + high )/2;
    	while( low <= high)
    	{
    		if( arr[mid] > target )
    			high = mid - 1;
    		else if ( arr[mid] < target )
    			low = mid + 1;
    		else
    		   return mid;
    		mid = (low + high)/2;
    	}
    	return -1;
    }
	public static void main( String[] args)
	{
		int[] arr = GetInputArr.getArray();
		int target = GetInputArr.getNumber();
		System.out.println(LinearSearch(arr,arr.length,target));
 	}
	
}
