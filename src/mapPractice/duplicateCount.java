package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class duplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,5,6,2,1,1,1,1,4,4};
		
		Map<Integer, Integer> frequencyMap = new HashMap();
		
		for(int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		
		System.out.println(frequencyMap);
		
		System.out.println("Duplicate elements in an array: ");
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
