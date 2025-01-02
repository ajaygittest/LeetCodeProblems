package com.javaAdvance;

public class Pallindrome {
	
	
	public static void main(String args[]) {
		
		System.out.println(sumDigit(12345678));
		
	}
	
	public static boolean getPalindrome(String input) {
		
		String rev="";
		
		for(int i=input.length()-1; i >=0; i--) {
			rev+=input.charAt(i);
		} 
		System.out.println(rev);
		
		if(input.equalsIgnoreCase(rev)) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean getNumPalindrome(int input) {
		
		int rev=0;
		int temp=input;
		
		while(input !=0) {
			rev=rev*10 + input%10;
			input=input/10;
		}
		System.out.println(rev);
		
		return temp==rev ? true :false;
	}
	
	public static int getCount(int count) {
		
		int result=0;
		
		while(count>0) {
			
			count=count/10;
			result++;
		}
		return result;
	}
	
	public static void getOddEven(int count) {
		
		int odd=0;
		int even=0;
		
		while(count>0) {
			
			int rem=count&10;
			
			if(rem%10==0) {
				even++;
			}else {
				odd++;
			}
			count=count/10;
			
		}
		
		System.out.println("Odd"+odd);
		System.out.println("Even"+even);
	}
	
	
	public static int sumDigit(int input) {
		
		int sum=0;
		
		while(input >0) {
			
			int rem=input%10;
			sum +=rem;
			input=input/10;
		}
		return sum;
	}

}
