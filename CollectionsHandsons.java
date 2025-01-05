package com.javaAdvance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsHandsons {
	
	public int removeElement(int[] nums, int val) {

        int k=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] !=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }

}
