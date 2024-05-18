package com.sheet.arrays;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		
		int[] arr = GetInputArr.getArray();
		int high = arr.length - 1;
		int low = 0;
		int mid = 0;
		while( mid <= high)
		{
			if( arr[mid] == 0 )
			{
				arr[mid] = arr[low];
				arr[low] = 0;
				low++;
				mid++;
			}
			else if( arr[mid] == 2 )
			{
				arr[mid] = arr[high];
				arr[high] = 2;
				high--;
			}
			else
				mid++;
		}
		System.out.println(Arrays.toString(arr));

	}

}
