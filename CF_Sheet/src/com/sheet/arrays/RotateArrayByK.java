package com.sheet.arrays;

import java.util.Arrays;

public class RotateArrayByK {
    public static void methodOne( int[] arr , int k )
    {
    	//Time Complexity : O(n)
    	//Space Complexity : O(n)
    	int n = arr.length;
    	if( k == n || k == 0)
    		return;
    	if( k > n)
    		k = k%n;
    	int[] newArr = new int[n];
    	for( int i = 0; i < n; i++ )
    		newArr[(i+k)%n] = arr[i];
    	for( int i = 0; i < n; i++)
    		arr[i] = newArr[i];
    }
    public static void reverseArray( int[] arr , int s, int e)
    {
    	int temp;
    	while( s < e )
    	{
    		temp = arr[s];
    		arr[s] = arr[e];
    		arr[e] = temp;
    		s++;
    		e--;
    	}
    }
    public static void methodTwo( int[] arr, int k)
    {
    	int n = arr.length;
    	if( k == n || k == 0)
    		return;
    	if( k > n)
    		k = k%n;
    	reverseArray(arr,0,(n-k)-1);
    	reverseArray( arr , (n-k),n-1);
    	reverseArray(arr,0,n-1);
    }
    
	public static void main(String[] args) 
	{
		int[] arr = GetInputArr.getArray();
		int k = GetInputArr.getNumber();
		methodTwo(arr,k);
		System.out.println(Arrays.toString(arr));

	}

}
