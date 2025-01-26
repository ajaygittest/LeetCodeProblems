package Sample;

public class MajorityOfElement {
	
	 public int majorityElement(int[] nums) {
		 
		 int count=0;
		 int major=nums[0];
		 
		 for(int num:nums) {
			 
			 if(count==0) {
				 major=num;
			 }
			 count+=(num==major)?1:-1;
		 }
		 return major;
	 }

}
