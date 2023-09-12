package com.newscape;

public class ReverseNumber {
	int reverse;
	public int reverseNum(int number){
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		return reverse;
	}
}
