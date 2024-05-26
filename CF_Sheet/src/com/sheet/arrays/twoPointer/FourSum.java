package com.sheet.arrays.twoPointer;

import java.util.*;

import com.sheet.arrays.GetInputArr;

public class FourSum
{
   public static List<List<Integer>> bruteForce(int[] arr,int target)
   {
	   //Time Complexity : O(n^4 )
	   //space complexity : O(n^4)
	   List<List<Integer>> ls = new ArrayList<>();
       Set<List<Integer>> set = new HashSet<>();
        for( int i = 0; i < arr.length; i++ )
	   {
		   for( int j = i + 1; j < arr.length; j++ )
		   {
			   for( int k = j+1; k < arr.length; k++)
			   {
				   for( int l = k+1; l<arr.length; l++)
				   {
                  
                      if( arr[i]+arr[j]+arr[k]+arr[l] == target )
                      {
                       Integer[] q = new Integer[]{arr[i],arr[j],arr[k],arr[l]};
                       Arrays.sort(q);
                       List<Integer> qua = new ArrayList<>(Arrays.asList(q));
                       if(!set.contains(qua))
                       {
                             ls.add(qua);
                             set.add(qua);
                       }
                        
                      }
              
				   }
			   }
		   }
          
	   }
      return ls;
	   
   }
   public static List<List<Integer>> bruteForce_2(int[] arr,int target)
   {
	   //Time Complexity : O(n^3 )
	   //space complexity : O(n^4)
	   List<List<Integer>> ls = new ArrayList<>();
       Set<List<Integer>> set = new HashSet<>();
       Set<Integer> vals = new HashSet<>();
        for( int i = 0; i < arr.length; i++ )
	   {
		   for( int j = i + 1; j < arr.length; j++ )
		   {
			   vals = new HashSet<>();
			  
			   for( int k = j+1; k < arr.length; k++)
			   {
				   int l = target - (arr[i]+arr[j]+arr[k]);
                  
                      if( vals.contains(l) )
                      {
                       Integer[] q = new Integer[]{arr[i],arr[j],arr[k],l};
                       Arrays.sort(q);
                       List<Integer> qua = new ArrayList<>(Arrays.asList(q));
                       if(!set.contains(qua))
                       {
                             ls.add(qua);
                             set.add(qua);
                       }
                        
                      }
                      vals.add(arr[k]);
              
				   
			   }
		   }
          
	   }
      return ls;
	   
   }
   public static List<List<Integer>> optimal(int[] nums, int target) {
       Arrays.sort(nums);
      
       List<List<Integer>> ans = new ArrayList<>();
       
       for (int i = 0; i < nums.length - 3; ) {

           for( int j = i + 1; j < nums.length - 2;  )
           {
              
               int begin = j+1;
               int end = nums.length - 1;

               long twoSumTargetLong = (long)target - ( (long) nums[i] + nums[j] );
               if( twoSumTargetLong > Integer.MAX_VALUE || twoSumTargetLong < Integer.MIN_VALUE )
                 break;

               int twoSumTarget = (int) twoSumTargetLong;
               
               int sum = 0;
               //using two pointer approach to find last two distict possible value sum equal to twoSumTarget
               while( begin < end )
               {
                   sum = nums[begin]+nums[end];
                   if( sum < twoSumTarget )
                   {
                    
                   while(begin < end && nums[begin] == nums[++begin]) ;//to iterate over duplicate
                         
                   }
                   else if( sum > twoSumTarget )
                   {
                       while(begin < end && nums[end] == nums[--end] ) ;
                   }
                   else
                   {
                      
                       
                       ans.add( Arrays.asList( nums[i] , nums[j] , nums[begin] ,nums[end] )  );
                       while(begin < end && nums[begin] == nums[++begin]) ;
                       while(begin < end && nums[end] == nums[--end] ) ;
                   }
               }
               while( j < nums.length - 2 && nums[j] == nums[++j] ) ;
              
           }
       
           while( i < nums.length - 3 && nums[i] == nums[++i] ) ;
       }
       return ans;
   }
   
   
   public static void main( String[] args )
   {
	   int[] arr = GetInputArr.getArray();
	   System.out.print("Target ");
	   int target = GetInputArr.getNumber();
	   List<List<Integer>> ls = optimal(arr,target);
	   ls.stream().forEach(qua ->{System.out.println(Arrays.toString(qua.toArray()));});
   }
}
