package com.sheet.arrays;

public class MissingNumber 
{
	
    public static void main( String[] args )
    {
    	//value inside the arr is 1 to n
    	int[] arr = GetInputArr.getArray();
    	int n = GetInputArr.getNumber();
    	int sum = 0;
    	for( int num : arr )
    		sum += num;
    	int missingNum = (( n * ( n + 1))/2) - sum;
    	System.out.println(missingNum);
    }
}
