package com.sheet.basicMath;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = GetInput.getNumber();
       int ans = 0;
       while( num > 0)
       {
    	   ans *= 10;
    	   ans += (num%10);
    	   num /= 10;
       }
       System.out.println("Reverse : "+ans);
	}

}
