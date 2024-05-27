package com.sheet.arrays.twoPointer;

public class KthElement {
    
	 public static long firstApproach( int arr1[], int arr2[], int n, int m, int k) {
	        //Time Complexity : O(n+m)
		    //Space Complexity : O(n+m)
	        int[] ans = new int[n+m];
	        
	        int i = 0;
	        int j = 0;
	        int index = 0;
	        while( i < n && j < m )
	        {
	            if( arr1[i] < arr2[j] )
	                ans[index++] = arr1[i++];
	            else
	                ans[index++] = arr2[j++];
	        }
	        
	        while( i < n ) ans[index++]=arr1[i++];
	        while( j < m ) ans[index++]=arr2[j++];
	        
	        return ans[ k - 1];
	        
	    }
	 public static long optimal( int arr1[], int arr2[], int n, int m, int k) {
	        //Time Complexity : O(k)
		    //Space Complexity : O(1)
		 
	        int ans = arr1[0]<arr2[0]?arr1[0]:arr2[0];
	        
	        int i = 0;
	        int j = 0;
	        int index = 0;
	        while( i < n && j < m && index != k )
	        {
	            if( arr1[i] < arr2[j] )
	                ans = arr1[i++];
	            else
	              ans = arr2[j++];
	              
	            index++;
	        }
	        
	        while( i < n && index != k ) { ans=arr1[i++]; index++; }
	        while( j < m && index != k )  { ans=arr2[j++]; index++; }
	        
	        return ans;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
