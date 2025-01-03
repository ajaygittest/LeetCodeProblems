package com.javaAdvance;

public class Reverse {
	
	
	public static void main(String args[]) {
		
		System.out.println(reverse("Yesu Raja"));
		System.out.println(reverseNur(123445670));
		
	}

	public static String reverse(String name) {
		String reverse="";
		
		for(int i=name.length()-1; i>=0; i--) {
			reverse +=name.charAt(i);
		}
		return reverse;
	}
	
	public static StringBuffer reverseNumber(int num) {
		
		StringBuffer sB=new StringBuffer(String.valueOf(num));
		
		StringBuffer reverse=sB.reverse();
		
		return reverse;
	}
	
	public static Integer reverseNur(int num) {
		
		int rev=0;
		while(num !=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
}
