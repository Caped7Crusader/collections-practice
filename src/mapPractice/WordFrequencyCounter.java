package mapPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "This is a sample text. It contains some words. Sample text is important.";
		System.out.println(text);
		String cleanedText = text.replaceAll("[^a-zA-Z\s]", "").toLowerCase();
		System.out.println(cleanedText);
		String[] textArr = cleanedText.split(" ");
		System.out.println(Arrays.asList(textArr));
		
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(String word : textArr) {
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}
		
		System.out.println(frequencyMap);
		
		for(String key : frequencyMap.keySet()) {
			if(frequencyMap.get(key) > 1) {
				System.out.println(key);
			}	
		}
	}

}
