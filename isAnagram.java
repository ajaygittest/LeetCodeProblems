package Sample;

public class isAnagram {
	
	public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] nums= new int[26];

        for(int i=0; i<s.length(); i++){

            nums[s.charAt(i)-'a']++;
            nums[t.charAt(i)-'a']--;
        }

        for(int num:nums){
            if(num !=0){
                return false;
            }
        }

        return true;


    }

}
