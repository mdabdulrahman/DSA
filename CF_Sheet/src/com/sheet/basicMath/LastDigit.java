package com.sheet.basicMath;
import java.util.Scanner;
public class LastDigit {
 
	public static void main(String[] args)
	{
	    int num = GetInput.getNumber();
		System.out.println("Last Digit : "+num%10);
	}
}
