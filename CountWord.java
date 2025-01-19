
package Sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWord {
    
    public static void main(String[] args) {
        String input = "Hello world! This is a test. Test hello world!";
        countWords(input);
    }

    public static void countWords(String input) {
    	
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();


        String[] words = input.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Repeating words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}