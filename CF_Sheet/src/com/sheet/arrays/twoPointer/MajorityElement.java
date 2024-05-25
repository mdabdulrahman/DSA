package com.sheet.arrays.twoPointer;

import java.util.Arrays;

import com.sheet.arrays.GetInputArr;

public class MajorityElement {

	public static int firstApproach( int[] arr)
	{
		//Time complexity : O( N log N * N)
		//space complexity : O(1)
		Arrays.sort(arr);
		int count = 0;
		int i = 0;
		int maxCount = 0;
		int maxIndex = 0;
		while( i < arr.length - 1 )
		{
			count = arr[i] == arr[i+1]?count+1:0;
			if( maxCount < count )
			{
				maxCount = count;
				maxIndex = i;
			}
			i++;
		}
		return arr[maxIndex];
	}
	public static int secondApproach( int[] arr )
	{
		//Time Complexity : O( N Log N)
		//Space Complexity : O(1)
		Arrays.sort( arr );
		return arr[(arr.length/2)];
	}
	public static int thirdApproach( int[] arr )
	{
		int val = arr[0];
		int count = 1;
		for( int i = 1; i < arr.length; i++ )
		{
			if( val == arr[i] )
			  count++;
			else
			   count--;
			if( count == 0 )
			{
				val = arr[i];
				count = 1;
			}
		}
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = GetInputArr.getArray();
        System.out.println(secondApproach(arr));
	}

}
