package com.sheet.sorting;

import java.util.Arrays;

import com.sheet.arrays.GetInputArr;

public class BubbleSort 
{
	static void swap( int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main( String[] args )
	{
		int[] arr = GetInputArr.getArray();
		int n = arr.length;
		int steps = 0;
		boolean isSorted = true;
		for( int i = 0; i < n - 1; i++)  //each pass will be n - 1
		{
			
			isSorted = true;
			for(int j = 0; j < (n-1)-i; j++)
			{
				System.out.println(++steps);
				if( arr[j] > arr[j+1]) {
				   swap(arr,j,j+1);
				   isSorted = false;
				}
			}
			
			if(isSorted)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}
}
