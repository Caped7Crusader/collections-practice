package mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdecba";
		
		Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
		for(int i = 0; i < str.length(); i++) {
			frequencyMap.put(str.charAt(i), frequencyMap.getOrDefault(str.charAt(i), 0) + 1);
		}
		
		System.out.println(frequencyMap);
		
		for(Map.Entry<Character, Integer> map : frequencyMap.entrySet()) {
			if(map.getValue() == 1) {
				System.out.println(map.getKey());
				break;
			}			
		}
	}

}
