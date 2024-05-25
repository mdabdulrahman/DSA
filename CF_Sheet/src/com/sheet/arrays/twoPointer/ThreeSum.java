package com.sheet.arrays.twoPointer;

import java.util.*;

import com.sheet.arrays.GetInputArr;
//to return true if sum of any three elements in a array is equal to sum
public class ThreeSum 
{
   public static boolean BruteForce(int[] arr,int target)
   {
	   //Time Complexity : O(n^3)
	   //Space Complexity : O(1)
	   for( int i = 0; i < arr.length; i++ )
	   {
		   for( int j = 0; j < arr.length ; j++ )
		   {
			   
			   for( int k = 0; k < arr.length; k++)
			   {
				   if( j == k || i == j || i==k)
				        continue;
				   
				   if( arr[i]+arr[j]+arr[k] == target)
					   return true;
			   }
		   }
	   }
	   return false;
   }
   public static boolean Better( int[] arr, int target)
   {
	   //Time Complexity : o(n^2)
	   //Space Complexity : o(n);
	   Set<Integer> set ;
	   int temp;
	   for( int i = 0; i < arr.length; i++ )
	   {
		   set = new HashSet<>();
		   for( int j = 0; j < arr.length; j++ )
		   {
			   if( i == j )
				   continue;
			   temp = target - (arr[i]+arr[j]);
			   if(set.contains(temp))
				   return true;
			   set.add(arr[j]);
		   }
		   
	   }
	   return false;
   }
   public static boolean Optimal(int[] arr, int target)
   {
	   
	   Arrays.sort(arr);
	   int  j = 0, k = arr.length - 1;
	   int sum = 0;
	   for( int i = 0; i < arr.length - 2; i++)
	   {
		   j = i + 1;
		   k = arr.length - 1;
		   while(  j <  k )
		   {
			   sum = arr[i]+arr[k]+arr[j];
			   if( sum > target )
			   {
				   k--;
			   }
			   else if (sum < target)
				   j++;
			   else
				   return true;
		   }
	   }
	   
	   return false;
   }
   public static void main( String[] args)
   {
	   int[] arr = GetInputArr.getArray();
	   System.out.print("Target");
	   int target = GetInputArr.getNumber();
	   
	   
	   
   }
   
}
