package Sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacter {
	
	
	public static void main(String args[]) {
		
		String input="Programming";
		
		input=input.toLowerCase();
		
		Map<Character,List<Integer>> charIndiceMap=new HashMap<>();
		
		for(int i=0; i<input.length(); i++) {
			
			char c=input.charAt(i);
			
			charIndiceMap.putIfAbsent(c, new ArrayList<>());
			charIndiceMap.get(c).add(i);
			
		}
		
		System.out.println(charIndiceMap);
	}

}
