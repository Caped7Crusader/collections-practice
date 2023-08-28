package mapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] wordArr = {"listen", "silent", "hello", "world", "this", "hits"};
		Map<String, List<String>> anagramMap = new HashMap<>();
		for(String word : wordArr) {
			char[] charArr = word.toCharArray();
			Arrays.sort(charArr);
			String sortedWord = new String(charArr);
			
			anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
		}
		System.out.println(anagramMap);
		
		for(String key : anagramMap.keySet()) {
			if(anagramMap.get(key).size() > 1) {
				System.out.println(anagramMap.get(key));
			}
		}
	}
}
