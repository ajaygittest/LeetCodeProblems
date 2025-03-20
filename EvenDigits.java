package Kunal;

public class EvenDigits {
	
	public static void main(String args[]) {
		
		int[] nums= {12,345,2,6,7896};
		System.out.println(evenDigits(nums));
		
	}
	
	public static int evenDigits(int[] nums) {
		
		int count=0;
		
		for(int num:nums) {
			
			if(even(num)) {
				count++;
			}
		}
		return count;
		
		
	}

	private static boolean even(int num) {
		
		
		
		return digitsCount(num)%2==0;
	}

	private static int digitsCount(int num) {
		int even=0;
		
		while(num>0) {
			even++;
			num=num/10;
		}
		return even;
	}

}
