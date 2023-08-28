package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class printingMapUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,2,1,1,1,1,4,4};
		
		Map<Integer, Integer> frequencyMap = new HashMap();
		
		for(int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		
		System.out.println(frequencyMap);
		
		frequencyMap.entrySet().stream()
	    						.filter(entry -> entry.getValue() > 1)
	    						.forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

	}

}
