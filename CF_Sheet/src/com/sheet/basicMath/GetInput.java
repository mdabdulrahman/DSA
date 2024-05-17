package com.sheet.basicMath;

import java.util.Scanner;

public class GetInput {

	static Scanner in = new Scanner(System.in);
	public static int getNumber(){
	
		
		System.out.print("Enter number : ");
		int num = in.nextInt();
		return num;
	}
	public static int[] getTwoNumber(){
	
		System.out.print("Enter A and B number : ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		return new int[] {num1,num2};
	}

}
