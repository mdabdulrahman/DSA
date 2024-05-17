package com.sheet.basicMath;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = GetInput.getNumber();
        int count = 0;
        while( num > 0 )
        {
        	num /= 10;
        	count++;
        }
        System.out.println("No of Digits is "+count);
	}

}
