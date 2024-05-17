package com.sheet.basicMath;

public class EvenOrOdd {

	static boolean  evenOrOdd( int num )
	{
		return num%2 == 0; //if even it returns true
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(evenOrOdd(4)?"Even":"Odd");
	}

}
