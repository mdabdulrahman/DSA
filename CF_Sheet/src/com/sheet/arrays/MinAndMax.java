package com.sheet.arrays;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {4,5,2,3,1,5};
        int min = arr[0];
        int max = arr[0];
        for( int i = 1; i < arr.length; i++ )
        {
        	if( min > arr[i] )
        		min = arr[i];
        	if( max < arr[i] )
        		max = arr[i];
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
	}

}
