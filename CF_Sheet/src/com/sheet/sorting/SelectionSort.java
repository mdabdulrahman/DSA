package com.sheet.sorting;

import java.util.Arrays;

import com.sheet.arrays.GetInputArr;

public class SelectionSort {
    
    static void swap( int[] arr,int i,int j)
    {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
	public static void main(String[] args) {
		
		int[] arr = GetInputArr.getArray();
		int n = arr.length;
		for( int i = 0; i < n - 1; i++ )
		{
			int max = 0;
			for( int j = 0; j < (n-i); j++)
			{
				if( arr[max] < arr[j])
					max = j;
			}
			swap(arr,max,(n-1)-i);
		}
		System.out.println(Arrays.toString(arr));

	}

}
