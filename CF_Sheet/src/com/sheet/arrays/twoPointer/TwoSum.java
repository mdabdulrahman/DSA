package com.sheet.arrays.twoPointer;

import java.util.*;

import com.sheet.arrays.GetInputArr;
//to return true if sum of any two elements is equal to target
public class TwoSum {
	//Better is best for Time complexity
	
	public static boolean BruteForce(int[] arr,int target)
	{
		//Time Complexity : O(n^2)
		//Space Complexity : O(1)
		for( int i = 0; i < arr.length; i++ )
		{
			for( int j = i+1; j< arr.length; j++)
			{
				if( arr[i] + arr[j]  == target)
					return true;
			}
		}
		return false;
	}
	
	public static boolean Better(int[] arr, int target)
	{
		//Time Complexity : O(n)
		//Space Complexity : O(n)
		Set<Integer> arrVals = new HashSet<>();
		
		int temp;
		for( int i = 0; i < arr.length; i++)
		{
			temp = target - arr[i];
			if( arrVals.contains( temp ))
			  return true;
			else
				arrVals.add(arr[i]);
		}
		return false;
		
	}
	
	public static boolean Optimal(int[] arr,int target)
	{
		//Time Complexity : N log N
		//Space Complexity : O(1)
		
		Arrays.sort(arr);
		int s = 0 , e = arr.length - 1;
		while( s < e )
		{
			if( arr[s] + arr[e] < target )
				s++;
			else if( arr[s] + arr[e] > target )
				e--;
			else
				return true;
		}
		return false;
	}
	
   
	public static void main(String[] args)
	{
		int[] arr = GetInputArr.getArray();
		System.out.print("Target ");
		int target = GetInputArr.getNumber();
		
		
		System.out.println("-- Using Brute Force --");
		
		boolean res = BruteForce(arr,target);
		System.out.println(res);
		
		
		System.out.println("-- Using Better Approach --");
		
	    res = Better(arr,target);
	
		System.out.println(res);
		
		
		System.out.println("-- Using Optimal Approach --");
		
	    res = Optimal(arr,target);
	
		System.out.println(res);
		
		
 	}
	
}
