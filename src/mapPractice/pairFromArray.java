package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class pairFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,4,3,2,1,};
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for(Integer num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
		}
		System.out.println(frequencyMap);
		
		int pair = (int)frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1).count();
		System.out.println(pair);
		
		int pair1 = 0;
		for(Integer key : frequencyMap.keySet()) {
			if(frequencyMap.get(key) > 1) {
				pair1++;
			}
		}
		System.out.println(pair1);
		
		int pair2 = 0;
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if(entry.getValue() > 1) {
				pair2++;
			}
		}
		System.out.println(pair2);
		
		int pair3 = 0;
		for(int frequency : frequencyMap.values()) {
			if(frequency > 1) {
				pair3++;
			}
		}
		System.out.println(pair3);

	}

}
