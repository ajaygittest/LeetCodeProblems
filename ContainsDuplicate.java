package Sample;

import java.util.HashSet;

public class ContainsDuplicate {
	
	 public boolean hasDuplicate(int[] nums) {

         HashSet<Integer> filterNumber= new HashSet<Integer>();

        for(int num:nums){
            if(filterNumber.contains(num)){
                return true;
            }
                filterNumber.add(num);
            
        }
            return false;
    }


}
