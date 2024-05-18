package com.sheet.arrays;

import java.util.Scanner;
import com.sheet.basicMath.*;
public class GetInputArr extends GetInput {
   static Scanner in = new Scanner(System.in);
   public static int[] getArray()
   {
	   int n = in.nextInt();
	   int[] arr = new int[n];
 	   for( int i = 0; i < n; i++)
	       arr[i] = in.nextInt();
 	   return arr;
   }
}
