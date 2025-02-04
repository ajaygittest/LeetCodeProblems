package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {
	
	public static void main(String args[]) {
		String[] str ={"act","pots","tops","cat","stop","hat"};
		System.out.println(groupAnagrams(str));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		Map<String,List> result = new HashMap<>();
		
		if(strs.length ==0) {
			return new ArrayList();
		}
		int[] count = new int[26];
		for(String s : strs) {
			Arrays.fill(count, 0);
			
			for(char c : s.toCharArray()) {
				count[c-'a']++;
			}
			
			StringBuilder sb=new StringBuilder("");
			
			for(int i=0; i<26; i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			 String key = sb.toString();
			 
			 if(!result.containsKey(key)) {
				 result.put(key, new ArrayList());
			 }
			 result.get(key).add(s);
			
			
		}
		return new ArrayList(result.values());
		
	
	}

}
