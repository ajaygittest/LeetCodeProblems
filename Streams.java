package Codings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String args[]) {
		Stream();
	}
	
	public static void Stream() {
		
		List<Integer> data = Arrays.asList(1,2,3,3,null,4,5,6,8,8);
		
		 List<Integer> duplicates=data.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(f->f,Collectors.counting())).entrySet()
		.stream().filter(f->f.getValue()>1).map(Map.Entry::getKey)                                         // Extract the keys (duplicates)
        .collect(Collectors.toList()); 
		System.out.println(duplicates);
	}
}
