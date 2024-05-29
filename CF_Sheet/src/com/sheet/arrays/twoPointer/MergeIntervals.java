package com.sheet.arrays.twoPointer;
import java.util.*;
public class MergeIntervals 
{
  public static int[][] firstApproach( int[][] intervals)
  {
	  //Time Complexity : O( N Log N)
	  //Space Complexity : O(N)
	  List<List<Integer>> ans = new ArrayList<>();
      int n = intervals.length;
      
      int[] prefixMax = new int[n];
      int[] suffixMax = new int[n];
      

     for( int i = 0; i < n; i++)
     {
       prefixMax[i] = intervals[i][0];
       suffixMax[i] = intervals[i][1];
     }
     Arrays.sort(prefixMax);
     Arrays.sort(suffixMax);

      int start=0;
      int  i = 0;

      while( i < n )
      {
       
          if(  i + 1 == n || prefixMax[i+1] > suffixMax[i]  )
          {
              ans.add( new ArrayList(Arrays.asList(prefixMax[start],suffixMax[i])) );
              start = i+1;
          }
          i++;
          
      }
      return ans.stream().map(k->k.stream().mapToInt(j->j).toArray()).toArray(int[][]::new);
  }
  public int[][] secondApproah(int[][] intervals) {
      List<int[]> ans = new ArrayList<>();

      Arrays.sort( intervals , ( i , j ) -> Integer.compare( i[0] , j[0]) );
      int[] curr = new int[2];
      curr[0] = intervals[0][0];
      curr[1] = intervals[0][1];

      for( int i = 1; i < intervals.length; i++)
      {
              if( curr[0] <= intervals[i][0] && curr[1] >= intervals[i][0] )
                  curr[1] = Math.max(curr[1],intervals[i][1]);
              else
              {
                  ans.add( new int[]{curr[0],curr[1] });
                  curr[0] = intervals[i][0];
                  curr[1] = intervals[i][1];
              }
      }
      
       ans.add( new int[]{curr[0],curr[1]} );
       
      return ans.toArray(new int[ans.size()][]);

  }
  public static void main(String[] args)
  {
	  
  }
}
