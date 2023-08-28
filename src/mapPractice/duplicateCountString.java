package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class duplicateCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArr = {"once","twice","twice","twice", "thrice", "thrice"};
		
		Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
		
		for(String str : strArr) {
			frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
		}

		System.out.println(frequencyMap);
		
		for(String key : frequencyMap.keySet()) {
			if(frequencyMap.get(key) == 1) {
				System.out.println(key);
			}
		}
	}

}
