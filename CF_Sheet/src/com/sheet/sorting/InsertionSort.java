package com.sheet.sorting;

import java.util.Arrays;

import com.sheet.arrays.GetInputArr;

public class InsertionSort {
    static void swap(int[] arr,int a,int b)
    {
    	int temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = temp;
    }
	public static void main(String[] args) 
	{
	  int[] arr = GetInputArr.getArray();
	  int n = arr.length;
	  for( int i = 0; i < n - 1;i++)
	  {
		  int j = i+1;
		  while( j > 0 && arr[j-1] > arr[j]) swap(arr,j-1,j--);
	  }
	  System.out.println(Arrays.toString(arr));

	}

}
